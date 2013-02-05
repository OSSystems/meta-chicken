DESCRIPTION = "A compiler that translates Scheme source files to C, and an interpreter"
HOMEPAGE = "http://www.call-cc.org/"
SECTION = "devel"
PRIORITY = "optional"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e1cea16bc145a58d50a8de4ec0072206"

PR = "r1"

DEPENDS = "chicken-cross"
DEPENDS_virtclass-cross = ""

SRC_URI = "http://code.call-cc.org/releases/4.8.0/chicken-${PV}.tar.gz"

SRC_URI[md5sum] = "3013145f5b8bc21641d5b586daed9f54"
SRC_URI[sha256sum] = "a60efa9d2a621ecb9e03b41ebdd03ae27ecb32c1292671fd969506c9baf88d0c"

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

inherit autotools

export C_COMPILER="${CC}"
export C_COMPILER_virtclass-cross="${HOST_PREFIX}gcc"
export TARGET_C_COMPILER="${TARGET_PREFIX}gcc"

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
    TARGET_RUN_PREFIX=${target_prefix} \
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
FILES_${PN}-dev += "${localstatedir}/lib/*chicken/*/types.db"

BBCLASSEXTEND = "cross"
