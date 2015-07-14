require chicken.inc

DESCRIPTION = "A compiler that translates Scheme source files to C, and an interpreter (cross-canadian for ${TARGET_ARCH} target)"
PN = "chicken-cross-canadian-${TRANSLATED_TARGET_ARCH}"

DEPENDS = "virtual/${HOST_PREFIX}gcc-crosssdk nativesdk-libgcc chicken-native"

SRC_URI += "file://0001-chicken-install-use-programs-from-PATH.patch"

inherit cross-canadian

# We want the MULTIARCH_TARGET_SYS to point to the TUNE_PKGARCH, not PACKAGE_ARCH as it
# could be set to the MACHINE_ARCH
REAL_MULTIMACH_TARGET_SYS = "${TUNE_PKGARCH}${TARGET_VENDOR}-${TARGET_OS}"
# Path to SDK target sysroot.
SDKPATHTARGET = "${SDKPATH}/sysroots/${REAL_MULTIMACH_TARGET_SYS}"

EXTRA_OEMAKE = " \
    BINDIR=${bindir} \
    LIBDIR=${libdir} \
    VARDIR=${localstatedir}/lib \
    PLATFORM=linux \
    PREFIX=${prefix} \
    ARCH=${@chicken_arch(bb, d)} \
    \
    C_COMPILER="gcc" \
    C_COMPILER_OPTIONS="-fno-strict-aliasing -fwrapv -DHAVE_CHICKEN_CONFIG_H ${HOST_CC_ARCH} ${HOST_CFLAGS}" \
    LINKER_OPTIONS="${HOST_CC_ARCH} ${TOOLCHAIN_OPTIONS}" \
    \
    PROGRAM_PREFIX=${TARGET_PREFIX} \
    TARGET_LIB_NAME=chicken \
    TARGET_PREFIX=${SDKPATHTARGET}/usr \
    TARGETSYSTEM=${TARGET_SYS} \
    \
    TARGET_C_COMPILER="${TARGET_PREFIX}gcc" \
    TARGET_LINKER_OPTIONS="--sysroot=${SDKPATHTARGET}" \
    TARGET_C_COMPILER_OPTIONS="-fno-strict-aliasing -fwrapv -DHAVE_CHICKEN_CONFIG_H \
    ${TARGET_CC_ARCH} ${TARGET_CFLAGS} -I${SDKPATHTARGET}/usr/include" \
"

do_chicken_bootstrap() {
    oe_runmake -f Makefile.linux spotless

    echo "#define C_BUILD_TAG \"compiled `date +%Y-%m-%d` on `hostname` (`uname`)\"" > ${S}/buildtag.h
    echo > ${S}/buildbranch

    oe_runmake -f Makefile.linux distfiles
}
addtask chicken_bootstrap after do_patch before do_compile

FILES_${PN} += " \
    ${datadir}/*chicken/*.* \
    ${libdir}/lib*chicken.so.* \
    ${localstatedir}/lib/*chicken/*/types.db \
    ${localstatedir}/lib/*chicken/*/*.so \
"
INSANE_SKIP_${PN} += "useless-rpaths"

FILES_${PN}-dbg += "${localstatedir}/lib/*chicken/*/.debug"
FILES_${PN}-doc += "${datadir}/*chicken/doc"

BBCLASSEXTEND = "native"
