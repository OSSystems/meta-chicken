SECTION = "devel/chicken"
DESCRIPTION = "Compact integer sets."
LICENSE = "LGPL-3"
LIC_FILES_CHKSUM = "file://cis.meta;md5=5d6330ce7299c96ef31cd21e0cd5cdef"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/cis/cis-${PV}.tar.gz"

SRC_URI[md5sum] = "f7132cae96efc5434d8392672111096c"
SRC_URI[sha256sum] = "ff558d14f22e07b5b95e103ce2f83e1d0a56a1f9b2b80c07f4bc9877073cbe2b"

S = "${WORKDIR}/cis-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
