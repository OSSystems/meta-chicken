SECTION = "devel/chicken"
DESCRIPTION = "Type syntax stubs for Chicken < 4.7.5"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://type-stubs.meta;md5=f46e66ab6ea1f4058518853a3ca01806"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "f5cfcfa68c20ad12ab73c6a22fe1c635"
SRC_URI[sha256sum] = "c1503e56b0231ebcc494ffaadcfb8590587fe8f03df90e03b16ebdf218e5f934"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
