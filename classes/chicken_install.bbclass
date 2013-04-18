DEPENDS_virtclass-cross += "chicken-cross"
DEPENDS += "chicken-cross chicken"

PKG_CONFIG_PATH_virtclass-cross .= "${STAGING_LIBDIR_NATIVE}/pkgconfig:${STAGING_DATADIR_NATIVE}/pkgconfig"
PKG_CONFIG_SYSROOT_DIR_virtclass-cross = ""

EGG = "${@d.getVar('PN', True).replace('chicken-egg-', '').replace('-cross', '')}"

INSANE_SKIP_${PN} += "useless-rpaths"

# For recipes which use this class and need D.
export DESTDIR="${D}"

do_fetch[depends] += "chicken-cross:do_populate_sysroot"

do_install () {
    CSC_OPTIONS="-L --sysroot=${STAGING_DIR_TARGET} \
                 -L${STAGING_DIR_TARGET}${libdir} \
                 -L${STAGING_DIR_TARGET}${base_libdir}\
                 -I${STAGING_DIR_TARGET}${includedir} \
                 -I${STAGING_DIR_TARGET}${includedir}/chicken" \
    CHICKEN_INCLUDE_PATH=${STAGING_DIR_NATIVE}/${localstatedir}/share/chicken \
    \
    ${TARGET_PREFIX}chicken-install -target -prefix ${D}${localstatedir}

    # Fix install path
    if [ -d ${D}${localstatedir}/bin ]; then
        install -d ${D}/${bindir}
        mv ${D}${localstatedir}/bin/.debug ${D}${bindir} || true
        mv ${D}${localstatedir}/bin/*  ${D}${bindir} || true
        rm -r ${D}${localstatedir}/bin
    fi
}

do_install_virtclass-cross () {
    CSC_OPTIONS="-L${STAGING_LIBDIR_NATIVE} \
                 -L${libdir} \
                 -L${base_libdir} \
                 -I${includedir} \
                 -I${includedir}/chicken" \
    CHICKEN_INCLUDE_PATH=${localstatedir}/share/chicken \
    \
    ${TARGET_PREFIX}chicken-install -host -prefix ${D}${localstatedir}

    # Fix install path
    mv ${D}${localstatedir}/lib/chicken ${D}${localstatedir}/lib/${TARGET_PREFIX}chicken
    if [ -d ${D}${localstatedir}/bin ]; then
        install -d ${D}/${bindir}
        mv ${D}${localstatedir}/bin/.debug ${D}${bindir} || true
        mv ${D}${localstatedir}/bin/*  ${D}${bindir} || true
        rm -r ${D}${localstatedir}/bin
    fi
}

PACKAGES = "${PN}-dbg ${PN}"

FILES_${PN}-dbg += "${localstatedir}/lib/chicken/*/.debug/*"
FILES_${PN} += "${localstatedir}/lib/chicken/*/* ${localstatedir}/share/chicken/*"
