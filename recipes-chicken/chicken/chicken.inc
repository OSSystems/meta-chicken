DESCRIPTION = "A compiler that translates Scheme source files to C, and an interpreter"
HOMEPAGE = "http://www.call-cc.org/"
SECTION = "devel"
PRIORITY = "optional"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2daeb0ee01dccec5eaa812c48aa1bf94"

SRC_URI = "http://code.call-cc.org/releases/4.10.0/chicken-${PV}.tar.gz \
           file://defaults.make-Allow-changing-of-install-flags.patch"

SRC_URI[md5sum] = "5585edb369eb2a49f1f92775419852e7"
SRC_URI[sha256sum] = "0e07f5abcd11961986950dbeaa5a40db415f8a1b65daff9c300e9b05b334899b"

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
