SECTION = "devel/chicken"
DESCRIPTION = "SRFI-42 (Eager comprehensions)"
LICENSE = "SRFI"
LIC_FILES_CHKSUM = "file://srfi-42.meta;md5=ca2ecbe8464898ce609aade8afd31aec"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-42/srfi-42-${PV}.tar.gz"

SRC_URI[md5sum] = "ed566d98f2ebf0f41ba7e40a6c99e7a5"
SRC_URI[sha256sum] = "9a14f5d6d3a7b762e7d7f682254a66f9960143d4ae7f752d0f1175f3544bfaa2"

S = "${WORKDIR}/srfi-42-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
