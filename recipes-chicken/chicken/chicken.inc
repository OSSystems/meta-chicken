DESCRIPTION = "A compiler that translates Scheme source files to C, and an interpreter"
HOMEPAGE = "http://www.call-cc.org/"
SECTION = "devel"
PRIORITY = "optional"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=372956880a14c8e58055cdb2de5e6a38"

SRC_URI = "http://code.call-cc.org/dev-snapshots/2017/02/06/chicken-4.12.0rc2.tar.gz"

SRC_URI_append_class-target = " \
           file://defaults.make-Allow-changing-of-install-flags.patch \
"

SRC_URI[md5sum] = "4d1010eddb9793ffddbb9ee3e74df0d2"
SRC_URI[sha256sum] = "19bc4d2e2a866a84f5fcd71af55b4c924fa1409ad990e9d912e41d1975da7a3a"

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
