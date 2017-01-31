DESCRIPTION = "A compiler that translates Scheme source files to C, and an interpreter"
HOMEPAGE = "http://www.call-cc.org/"
SECTION = "devel"
PRIORITY = "optional"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=372956880a14c8e58055cdb2de5e6a38"

SRC_URI = "http://code.call-cc.org/dev-snapshots/2017/01/22/chicken-4.12.0rc1.tar.gz"

SRC_URI_append_class-target = " \
           file://defaults.make-Allow-changing-of-install-flags.patch \
"

SRC_URI[md5sum] = "57f00f60cd11201e156ee770d508bd93"
SRC_URI[sha256sum] = "677168813750264b162d1be041c05ffdcab273b8faaed5902c07a440bedcf5b0"

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


do_configure() {
    rm -f ${S}/chicken-defaults.h
}

do_compile() {
    oe_runmake all
}

do_install() {
    oe_runmake install DESTDIR=${D}
}
