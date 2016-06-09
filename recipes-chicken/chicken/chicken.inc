DESCRIPTION = "A compiler that translates Scheme source files to C, and an interpreter"
HOMEPAGE = "http://www.call-cc.org/"
SECTION = "devel"
PRIORITY = "optional"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c49f4048ed9e5ce5cee268ffe8d73d11"

SRC_URI = "http://code.call-cc.org/releases/4.11.0/chicken-${PV}.tar.gz"

SRC_URI[md5sum] = "065a6bae6e91e75f6e296cf3f5cb8b1d"
SRC_URI[sha256sum] = "e3dc2b8f95b6a3cd59c85b5bb6bdb2bd9cefc45b5d536a20cad74e3c63f4ad89"

S = "${WORKDIR}/chicken-${PV}"

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

do_install() {
    oe_runmake install DESTDIR=${D}
}
