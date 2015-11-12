SECTION = "devel/chicken"
DESCRIPTION = "Design by contract"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://dbc.meta;md5=64d196c1322c7a5cc5bc31f4c0bfc4e0"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/dbc/dbc-${PV}.tar.gz"

SRC_URI[md5sum] = "9d96e43e4aceba0180c72c9121ce4d33"
SRC_URI[sha256sum] = "f13e5b11b282f8a55ae9f2990d845120d57f991a11721003a51ed1962d994c81"

S = "${WORKDIR}/dbc-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
