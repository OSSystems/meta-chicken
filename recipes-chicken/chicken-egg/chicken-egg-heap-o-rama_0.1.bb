SECTION = "devel/chicken"
DESCRIPTION = "..."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://heap-o-rama.meta;md5=766c9c93397b32c17dd61883d3612687"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/heap-o-rama/heap-o-rama-${PV}.tar.gz"

SRC_URI[md5sum] = "5bb8cc985cd7a43e6ef6b39afe932158"
SRC_URI[sha256sum] = "d8d303c4d0a00927142d50fe74a13807bdbb97b83cd6c22785e9e1b70d7bf4f9"

S = "${WORKDIR}/heap-o-rama-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
