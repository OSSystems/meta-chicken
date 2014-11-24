require chicken.inc

DEPENDS = "chicken-cross"
DEPENDS_class-cross = ""
DEPENDS_class-crosssdk = ""

INSANE_SKIP_${PN} += "useless-rpaths"
INSANE_SKIP_libchicken += "useless-rpaths"

EXTRA_OEMAKE = " \
    C_COMPILER="${TARGET_PREFIX}gcc" \
    C_COMPILER_OPTIONS="-fno-strict-aliasing -fwrapv -DHAVE_CHICKEN_CONFIG_H ${TARGET_CC_ARCH} ${TARGET_CFLAGS} ${TOOLCHAIN_OPTIONS}" \
    LINKER_OPTIONS="${TARGET_CC_ARCH} ${TOOLCHAIN_OPTIONS}" \
    BINDIR=${bindir} \
    LIBDIR=${libdir} \
    VARDIR=${localstatedir}/lib \
    PLATFORM=linux \
    PREFIX=${prefix} \
    ARCH=${@chicken_arch(bb, d)} \
"

EXTRA_OEMAKE_class-cross = " \
    BINDIR=${bindir} \
    LIBDIR=${libdir} \
    VARDIR=${localstatedir}/lib \
    PLATFORM=linux \
    PREFIX=${prefix} \
    ARCH=${@chicken_arch(bb, d)} \
    \
    PROGRAM_PREFIX=${TARGET_PREFIX} \
    TARGET_LIB_NAME=chicken \
    TARGET_PREFIX=${STAGING_DIR_TARGET} \
    TARGETSYSTEM=${TARGET_SYS} \
    TARGET_RUN_PREFIX=${target_prefix} \
    \
    C_COMPILER="${HOST_PREFIX}gcc" \
    TARGET_C_COMPILER="${TARGET_PREFIX}gcc" \
    TARGET_LINKER_OPTIONS="${TARGET_CC_ARCH}" \
    TARGET_C_COMPILER_OPTIONS="-fno-strict-aliasing -fwrapv -DHAVE_CHICKEN_CONFIG_H ${TARGET_CC_ARCH} ${TARGET_CFLAGS}" \
"

EXTRA_OEMAKE_class-crosssdk = " \
    BINDIR=${bindir} \
    LIBDIR=${libdir} \
    VARDIR=${localstatedir}/lib \
    PLATFORM=linux \
    PREFIX=${prefix} \
    ARCH=${@chicken_arch(bb, d)} \
    \
    PROGRAM_PREFIX=${TARGET_PREFIX} \
    TARGET_LIB_NAME=chicken \
    TARGET_PREFIX=${STAGING_DIR_TARGET} \
    TARGETSYSTEM=${TARGET_SYS} \
    TARGET_RUN_PREFIX=${target_prefix} \
    \
    C_COMPILER="${HOST_PREFIX}gcc" \
    TARGET_C_COMPILER="${TARGET_PREFIX}gcc" \
    TARGET_LINKER_OPTIONS="${TARGET_CC_ARCH} ${TOOLCHAIN_OPTIONS}" \
    TARGET_C_COMPILER_OPTIONS="-fno-strict-aliasing -fwrapv -DHAVE_CHICKEN_CONFIG_H ${TARGET_CC_ARCH} ${TARGET_CFLAGS}" \
"

do_install_append_class-cross() {
    # Remove things we don't need
    for d in share/${TARGET_SYS}-chicken/doc share/man; do
        rm -rf ${D}${STAGING_DIR_NATIVE}${prefix_native}/$d
    done
}

PACKAGES += "libchicken"

FILES_${PN} = "${bindir}/* ${datadir}/chicken/*.*"
FILES_libchicken = "${libdir}/lib*chicken.so.* ${localstatedir}/lib/*chicken/*/*.so"
FILES_${PN}-doc += "${datadir}/*chicken/doc"
FILES_${PN}-dbg += "${localstatedir}/lib/*chicken/*/.debug"
FILES_${PN}-dev += "${localstatedir}/lib/*chicken/*/types.db"

BBCLASSEXTEND = "cross crosssdk"
