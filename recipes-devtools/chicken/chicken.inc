DESCRIPTION = "A compiler that translates Scheme source files to C, and an interpreter"
HOMEPAGE = "http://www.call-cc.org/"
SECTION = "devel"
PRIORITY = "optional"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=627898e92f4ea7924d68a34baea22606"

SRC_URI = "http://code.call-cc.org/releases/4.9.0/chicken-${PV}.tar.gz"

SRC_URI[md5sum] = "f45e282c64714127309ae45119b4d306"
SRC_URI[sha256sum] = "04df7c439c36fc16446bdfa186e7a70258f911d2d826b5216a8e6b1cb2aa2815"

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
