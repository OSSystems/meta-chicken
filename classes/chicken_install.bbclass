DEPENDS_virtclass-cross += "chicken-cross"
DEPENDS += "chicken-cross chicken"

EGG = "${@d.getVar('PN', True).replace('chicken-egg-', '').replace('-cross', '')}"
EGG_VERSION = "${@base_ifelse(d.getVar('PV', True) == "trunk", "", ":" + d.getVar('PV', True))}"
EGGDIR = "${@d.getVar('PN', True).replace('-cross', '')}-${PV}"
DL_DIR_EGG = "${DL_DIR}/${EGGDIR}"

PKG_CONFIG_PATH_virtclass-cross .= "${STAGING_LIBDIR_NATIVE}/pkgconfig:${STAGING_DATADIR_NATIVE}/pkgconfig"
PKG_CONFIG_SYSROOT_DIR_virtclass-cross = ""

INSANE_SKIP_${PN} += "useless-rpaths"

# For recipes which use this class and need D.
export DESTDIR="${D}"

def chicken_install_has_src_uri(d):
    src_uri = d.getVar('SRC_URI', True)
    src_uris = src_uri.split()
    has = len(src_uris) and not src_uris[0].endswith(".patch")
    if has:
        bb.note("chicken_install: SRC_URI seems to contain something")
    else:
        bb.note("chicken_install: SRC_URI seems to be empty, assuming official Chicken egg")
    return has

do_fetch[lockfiles] += "${DL_DIR_EGG}.lock"
do_fetch[depends] += "chicken-cross:do_populate_sysroot"

python chicken_install_do_fetch() {
    import os

    if chicken_install_has_src_uri(d):
        bb.build.exec_func("base_do_fetch", d)
    else:
        # Use chicken-install to fetch the sources
        egg = d.getVar('EGG', True)
        eggdir = d.getVar('EGGDIR', True)
        eggver = d.getVar('EGG_VERSION', True)
        target_prefix = d.getVar('TARGET_PREFIX', True)

        if not os.path.exists(eggdir):
            bb.note("Calling: %schicken-install -debug -r %s%s" % (target_prefix, egg, eggver))
            if os.system("%schicken-install -debug -r %s%s" % (target_prefix, egg, eggver)) != 0:
                raise bb.build.FuncFailed("chicken-install failed to run")

            if os.system("mv %s %s" % (egg, eggdir)) != 0:
                raise bb.build.FuncFailed("Failed to move %s to %s" % (egg, eggdir))
}

python chicken_install_do_unpack () {
    import os
    egg = d.getVar('EGG', True)

    if chicken_install_has_src_uri(d):
        bb.build.exec_func("base_do_unpack", d)
    else:
        eggdir = d.getVar('EGGDIR', True)
        os.system('cp -a ' + d.getVar('DL_DIR', True) + '/' + eggdir + '/' + ' ' + d.getVar('WORKDIR', True))
}

do_install () {
    CSC_OPTIONS="-L${STAGING_DIR_TARGET}${libdir} \
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

EXPORT_FUNCTIONS do_fetch do_unpack

PACKAGES = "${PN}-dbg ${PN}"

FILES_${PN}-dbg += "${localstatedir}/lib/chicken/*/.debug/*"
FILES_${PN} += "${localstatedir}/lib/chicken/*/* ${localstatedir}/share/chicken/*"
