DEPENDS_class-cross += "chicken-cross"
DEPENDS_class-nativesdk += "chicken-crosssdk chicken-nativesdk"
DEPENDS += "chicken-cross chicken"

PKG_CONFIG_PATH_class-cross .= "${STAGING_LIBDIR_NATIVE}/pkgconfig:${STAGING_DATADIR_NATIVE}/pkgconfig"
PKG_CONFIG_SYSROOT_DIR_class-cross = ""

EGG = "${@d.getVar('BPN', True).replace('chicken-egg-', '')}"

INSANE_SKIP_${PN} += "useless-rpaths"

# For recipes which use this class and need D.
export DESTDIR="${D}"

EXTRA_CHICKEN_INSTALL_OPTIONS ?= ""

do_fetch[depends] += "chicken-cross:do_populate_sysroot"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install () {
    CSC_OPTIONS="-L ${TOOLCHAIN_OPTIONS} \
                 -L${STAGING_DIR_TARGET}${libdir} \
                 -L${STAGING_DIR_TARGET}${base_libdir}\
                 -I${STAGING_DIR_TARGET}${includedir} \
                 -I${STAGING_DIR_TARGET}${includedir}/chicken" \
    CHICKEN_INCLUDE_PATH=${STAGING_DIR_NATIVE}/${localstatedir}/share/chicken \
    \
    ${TARGET_PREFIX}chicken-install ${EXTRA_CHICKEN_INSTALL_OPTIONS} \
                                    -target -prefix ${D}${localstatedir}

    # Fix install path
    if [ -d ${D}${localstatedir}/bin ]; then
        install -d ${D}/${bindir}
        mv ${D}${localstatedir}/bin/.debug ${D}${bindir} || true
        mv ${D}${localstatedir}/bin/*  ${D}${bindir} || true
        rm -r ${D}${localstatedir}/bin
    fi
}

do_install_class-cross () {
    CSC_OPTIONS="-L${STAGING_LIBDIR_NATIVE} \
                 -L${libdir} \
                 -L${base_libdir} \
                 -I${includedir} \
                 -I${includedir}/chicken \
                 ${EXTRA_CSC_OPTIONS}" \
    CHICKEN_INCLUDE_PATH=${localstatedir}/share/chicken \
    \
    ${TARGET_PREFIX}chicken-install ${EXTRA_CHICKEN_INSTALL_OPTIONS} \
                                    -host -prefix ${D}${localstatedir}

    # Fix install path
    mv ${D}${localstatedir}/lib/chicken ${D}${localstatedir}/lib/${TARGET_PREFIX}chicken
    if [ -d ${D}${localstatedir}/bin ]; then
        install -d ${D}/${bindir}
        mv ${D}${localstatedir}/bin/.debug ${D}${bindir} || true
        mv ${D}${localstatedir}/bin/*  ${D}${bindir} || true
        rm -r ${D}${localstatedir}/bin
    fi
}

do_install_class-crosssdk () {
    CSC_OPTIONS="-L${STAGING_LIBDIR_NATIVE} \
                 -L${STAGING_BASE_LIBDIR_NATIVE} \
                 -I${STAGING_INCDIR_NATIVE} \
                 -I${STAGING_INCDIR_NATIVE}/${TARGET_PREFIX}chicken \
                 ${EXTRA_CSC_OPTIONS} -v" \
    CHICKEN_INCLUDE_PATH=${localstatedir}/share/${TARGET_PREFIX}chicken \
    \
    ${TARGET_PREFIX}chicken-install ${EXTRA_CHICKEN_INSTALL_OPTIONS} -host -prefix ${D}${prefix}

    # FIXME: chicken-install lacks some important options to better
    # support packaging of eggs; this workaround those limitations.
    mkdir -p ${D}${localstatedir}
    mv ${D}${prefix}/lib ${D}${localstatedir}/lib
    mv ${D}${localstatedir}/lib/chicken ${D}${localstatedir}/lib/${TARGET_PREFIX}chicken
    if [ -d ${D}${prefix}/share ]; then
        mv ${D}${prefix}/share ${D}${localstatedir}/share
        mv ${D}${localstatedir}/share/chicken ${D}${localstatedir}/share/${TARGET_PREFIX}chicken
    fi
    rmdir ${D}${prefix} || true
}

PACKAGES = "${PN}-dbg ${PN}-dev ${PN}"

FILES_${PN}-dbg += "${localstatedir}/lib/*chicken/*/.debug/*"
FILES_${PN} += "${localstatedir}/lib/*chicken/*/* ${localstatedir}/share/*chicken/*"
