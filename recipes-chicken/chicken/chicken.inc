DESCRIPTION = "A compiler that translates Scheme source files to C, and an interpreter"
HOMEPAGE = "http://www.call-cc.org/"
SECTION = "devel"
PRIORITY = "optional"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=372956880a14c8e58055cdb2de5e6a38"

SRC_URI = "https://code.call-cc.org/releases/${PV}/chicken-${PV}.tar.gz"

SRC_URI_append_class-target = " \
           file://defaults.make-Allow-changing-of-install-flags.patch \
"

SRC_URI[md5sum] = "96cd37a476157b5e3f0a647dd3c1cb63"
SRC_URI[sha256sum] = "605ace459bc66e8c5f82abb03d9b1c9ca36f1c2295931d244d03629a947a6989"

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
