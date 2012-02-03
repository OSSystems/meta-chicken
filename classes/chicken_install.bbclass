DEPENDS += "chicken"

EGG = "${@bb.data.getVar('PN', d, 1).replace('chicken-egg-', '').replace('-cross', '')}"
EGG_VERSION = "${@base_ifelse(bb.data.getVar('PV', d, 1) == "trunk", "", ":" + bb.data.getVar('PV', d, 1))}"
EGGDIR = "${@bb.data.getVar('PN', d, 1).replace('-cross', '')}-${PV}"

INSANE_SKIP_${PN} += "useless-rpaths"

# For recipes which use this class and need D.
export DESTDIR=${D}

def chicken_install_has_src_uri(d):
    src_uri = bb.data.getVar('SRC_URI', d, 1)
    src_uris = src_uri.split()
    has = not (len(src_uris) == 1 and src_uris[0].endswith(".bb"))
    if has:
        bb.note("chicken_install: SRC_URI seems to contain something")
    else:
        bb.note("chicken_install: SRC_URI seems to be empty, assuming official Chicken egg")
    return has


python chicken_install_do_fetch() {
    import os

    if chicken_install_has_src_uri(d):
        bb.build.exec_func("base_do_fetch", d)
    else:
        # Use chicken-install to fetch the sources
        egg = bb.data.getVar('EGG', d, 1)
        eggdir = bb.data.getVar('EGGDIR', d, 1)
        eggver = bb.data.getVar('EGG_VERSION', d, 1)
        target_prefix = bb.data.getVar('TARGET_PREFIX', d, 1)

        if not os.path.exists(eggdir):
            bb.note("Calling: %schicken-install -debug -r %s%s" % (target_prefix, egg, eggver))
            if os.system("%schicken-install -debug -r %s%s" % (target_prefix, egg, eggver)) != 0:
                raise bb.build.FuncFailed("chicken-install failed to run")

            if os.system("mv %s %s" % (egg, eggdir)) != 0:
                raise bb.build.FuncFailed("Failed to move %s to %s" % (egg, eggdir))
}

python chicken_install_do_unpack () {
    import os
    egg = bb.data.getVar('EGG', d, 1)

    if chicken_install_has_src_uri(d):
        bb.build.exec_func("base_do_unpack", d)
    else:
        eggdir = bb.data.getVar('EGGDIR', d, 1)
        os.system('cp -a ' + bb.data.getVar('DL_DIR', d, 1) + '/' + eggdir + '/' + ' ' + bb.data.getVar('WORKDIR', d, 1))
}

do_install () {
    CSC_OPTIONS="-L${STAGING_DIR_TARGET}${libdir} \
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
    CSC_OPTIONS="-L${STAGING_DIR_TARGET}${libdir} \
                 -I${STAGING_DIR_TARGET}${includedir} \
                 -I${STAGING_DIR_TARGET}${includedir}/chicken" \
    CHICKEN_INCLUDE_PATH=${STAGING_DIR_NATIVE}/${localstatedir}/share/chicken \
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
