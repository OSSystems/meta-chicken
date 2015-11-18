SECTION = "devel/chicken"
DESCRIPTION = "A permissive HTML parser"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://htmlprag.meta;md5=6ce66b3ae81d19ad29f1f43f80fa48ff"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/htmlprag/htmlprag-${PV}.tar.gz"

SRC_URI[md5sum] = "7935d1b10e885392dc4d993e4e271714"
SRC_URI[sha256sum] = "5d878c97b0ad8569b9ee0098b67a794cd474080a2a95f2214fb9015de5d6a847"

S = "${WORKDIR}/htmlprag-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
