DESCRIPTION = "A compiler that translates Scheme source files to C, and an interpreter"
HOMEPAGE = "http://www.call-cc.org/"
SECTION = "devel"
PRIORITY = "optional"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=627898e92f4ea7924d68a34baea22606"

DEPENDS = "chicken-cross"
DEPENDS_class-cross = ""

SRC_URI = "http://code.call-cc.org/releases/4.9.0/chicken-${PV}.tar.gz"

SRC_URI[md5sum] = "f45e282c64714127309ae45119b4d306"
SRC_URI[sha256sum] = "04df7c439c36fc16446bdfa186e7a70258f911d2d826b5216a8e6b1cb2aa2815"

INSANE_SKIP_${PN} += "useless-rpaths"
INSANE_SKIP_libchicken += "useless-rpaths"

# Parallel building is not supported
PARALLEL_MAKE = ""

def chicken_arch(bb, d):
    import re

    target_arch = d.getVar("HOST_ARCH", 1)
    if re.compile('^i.*86$').match(target_arch):
        return 'x86'
    elif target_arch == 'x86_64':
        return 'x86-64'
    else:
        return ''

do_configure[noexec] = "1"

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

do_install() {
    oe_runmake install DESTDIR=${D}
}

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

BBCLASSEXTEND = "cross"
