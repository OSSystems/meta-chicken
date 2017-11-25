require chicken.inc

DEPENDS_class-target_append = " virtual/${TARGET_PREFIX}chicken"

INSANE_SKIP_${PN} += "useless-rpaths"
INSANE_SKIP_libchicken += "useless-rpaths"
INSANE_SKIP_nativesdk-libchicken += "useless-rpaths"

EXTRA_OEMAKE = " \
    BINDIR=${bindir} \
    LIBDIR=${libdir} \
    VARDIR=${localstatedir}/lib \
    PLATFORM=linux \
    PREFIX=${prefix} \
    ARCH=${@chicken_arch(bb, d)} \
    \
    C_COMPILER="${TARGET_PREFIX}gcc" \
    C_COMPILER_OPTIONS="-fno-strict-aliasing -fwrapv -DHAVE_CHICKEN_CONFIG_H ${TARGET_CC_ARCH} ${TARGET_CFLAGS} ${TOOLCHAIN_OPTIONS}" \
    LINKER_OPTIONS="${TARGET_CC_ARCH} ${LDFLAGS} ${TOOLCHAIN_OPTIONS}" \
    \
    TARGET_C_COMPILER_OPTIONS="-fno-strict-aliasing -fwrapv -DHAVE_CHICKEN_CONFIG_H ${TARGET_CC_ARCH}" \
    TARGET_LINKER_OPTIONS="${TARGET_CC_ARCH}" \
    TARGET_RUN_LIB_HOME=${base_prefix}/var \
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
    TARGET_LINKER_OPTIONS="${TARGET_CC_ARCH} ${TARGET_LDFLAGS} ${TOOLCHAIN_OPTIONS}" \
    TARGET_C_COMPILER_OPTIONS="-fno-strict-aliasing -fwrapv -DHAVE_CHICKEN_CONFIG_H ${TARGET_CC_ARCH} ${TARGET_CFLAGS}" \
"

PACKAGES += "libchicken"

FILES_${PN} = "${bindir}/* ${datadir}/chicken/*.*"
FILES_libchicken = "${libdir}/lib*chicken.so.* ${localstatedir}/lib/*chicken/*/*.so"
FILES_${PN}-doc += "${datadir}/*chicken/doc"
FILES_${PN}-dbg += "${localstatedir}/lib/*chicken/*/.debug"
FILES_${PN}-dev += "${localstatedir}/lib/*chicken/*/types.db"

BBCLASSEXTEND = "crosssdk native nativesdk"
