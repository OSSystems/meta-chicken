
DESCRIPTION = "A compiler that translates Scheme source files to C, and an interpreter"
HOMEPAGE = "http://www.call-cc.org/"
SECTION = "devel"
PRIORITY = "optional"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=74157fa744cef15057bcd749b4b0d1cf"

DEPENDS = "chicken-cross"
DEPENDS_virtclass-cross = ""

# http://code.call-cc.org/releases/${PV}/chicken-${PV}.tar.gz
SRC_URI = "http://code.call-cc.org/dev-snapshots/2011/06/25/chicken-4.7.2.tar.gz \
           file://fix-defaults.patch"

SRC_URI[md5sum] = "e6e2fe0bfbb501a1470ac1c0e2608f78"
SRC_URI[sha256sum] = "58f2096d38dfd750f3ae6f8460a54b88421290e1e5074c571e57332e8bb7720a"

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

inherit autotools

export C_COMPILER=${CC}
export C_COMPILER_virtclass-cross=${HOST_PREFIX}gcc
export TARGET_C_COMPILER=${TARGET_PREFIX}gcc

EXTRA_OEMAKE = " \
    BINDIR=${bindir} \
    LIBDIR=${libdir} \
    VARDIR=${localstatedir}/lib \
    PLATFORM=linux \
    PREFIX=${prefix} \
    ARCH=${@chicken_arch(bb, d)} \
"

EXTRA_OEMAKE_virtclass-cross = " \
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
"

do_install_append_virtclass-cross() {
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

BBCLASSEXTEND = "cross"
