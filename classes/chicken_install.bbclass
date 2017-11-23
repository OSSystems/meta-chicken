DEPENDS_class-cross += "virtual/${TARGET_PREFIX}chicken"
DEPENDS_class-crosssdk += "virtual/${TARGET_PREFIX}chickensdk"
DEPENDS_class-nativesdk += "virtual/${TARGET_PREFIX}chickensdk chicken-nativesdk"
DEPENDS += "virtual/${TARGET_PREFIX}chicken chicken"

PKG_CONFIG_PATH_class-cross .= "${STAGING_LIBDIR_NATIVE}/pkgconfig:${STAGING_DATADIR_NATIVE}/pkgconfig"
PKG_CONFIG_SYSROOT_DIR_class-cross = ""

EGG = "${@d.getVar('BPN', True).replace('chicken-egg-', '')}"

CHICKEN_ABI_VERSION ?= "8"

INSANE_SKIP_${PN} += "useless-rpaths"

# For recipes which use this class and need D.
export DESTDIR="${D}"

EXTRA_CSC_OPTIONS ?= ""
EXTRA_CHICKEN_INSTALL_OPTIONS ?= ""
EXTRA_CHICKEN_INSTALL_OPTIONS_class-target ?= " -no-install-deps"
EXTRA_CHICKEN_INSTALL_OPTIONS_class-cross ?= " -no-install-deps"

do_fetch[depends] += "virtual/${TARGET_PREFIX}chicken:do_populate_sysroot"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install () {
    CSC_OPTIONS="-L ${TOOLCHAIN_OPTIONS} \
                 -L${STAGING_DIR_TARGET}${libdir} \
                 -L${STAGING_DIR_TARGET}${base_libdir}\
                 -I${STAGING_DIR_TARGET}${includedir} \
                 -I${STAGING_DIR_TARGET}${includedir}/chicken \
                 ${EXTRA_CSC_OPTIONS} -v" \
    CHICKEN_REPOSITORY=${STAGING_DIR_NATIVE}/${localstatedir}/lib/${TARGET_PREFIX}chicken/${CHICKEN_ABI_VERSION} \
    \
    ${TARGET_PREFIX}chicken-install ${EXTRA_CHICKEN_INSTALL_OPTIONS} -target -prefix ${D}${prefix}

    # FIXME: chicken-install lacks some important options to better
    # support packaging of eggs; this works around those limitations.
    mkdir -p ${D}${localstatedir}
    mv ${D}${prefix}/lib ${D}${localstatedir}/lib
    if [ -d ${D}${prefix}/share ]; then
        mv ${D}${prefix}/share ${D}${localstatedir}/share
    fi
    rmdir ${D}${prefix} || true
}

chicken_cross_build_and_install() {
    CSC_OPTIONS="-L${STAGING_LIBDIR_NATIVE} \
                 -L${STAGING_BASE_LIBDIR_NATIVE} \
                 -I${STAGING_INCDIR_NATIVE} \
                 -I${STAGING_INCDIR_NATIVE}/${TARGET_PREFIX}chicken \
                 ${EXTRA_CSC_OPTIONS} -v" \
    CHICKEN_REPOSITORY=${localstatedir}/lib/${TARGET_PREFIX}chicken/${CHICKEN_ABI_VERSION} \
    \
    ${TARGET_PREFIX}chicken-install ${EXTRA_CHICKEN_INSTALL_OPTIONS} -host -prefix ${D}${prefix}

    # FIXME: chicken-install lacks some important options to better
    # support packaging of eggs; this works around those limitations.
    mkdir -p ${D}${localstatedir}
    mv ${D}${prefix}/lib ${D}${localstatedir}/lib
    mv ${D}${localstatedir}/lib/chicken ${D}${localstatedir}/lib/${TARGET_PREFIX}chicken
    if [ -d ${D}${prefix}/share ]; then
        mv ${D}${prefix}/share ${D}${localstatedir}/share
        mv ${D}${localstatedir}/share/chicken ${D}${localstatedir}/share/${TARGET_PREFIX}chicken
    fi
    rmdir ${D}${prefix} || true
}

do_install_class-cross () {
    chicken_cross_build_and_install
}


do_install_class-crosssdk () {
    chicken_cross_build_and_install
}


PACKAGES = "${PN}-dbg ${PN}-dev ${PN}"

FILES_${PN}-dbg += "${localstatedir}/lib/*chicken/*/.debug/*"
FILES_${PN}-dev += "${localstatedir}/lib/*chicken/*/*.o ${localstatedir}/lib/*chicken/*/*.types"
FILES_${PN} += "${localstatedir}/lib/*chicken/*/* ${localstatedir}/share/*chicken/*"
