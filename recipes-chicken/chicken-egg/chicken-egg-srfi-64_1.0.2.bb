SECTION = "devel/chicken"
DESCRIPTION = "SRFI 64:"A Scheme API for test suites" implementation"
LICENSE = "SRFI"
LIC_FILES_CHKSUM = "file://srfi-64.meta;md5=a197ae9ab8a54e2ddc14b6c428232370"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-64/srfi-64-${PV}.tar.gz"

SRC_URI[md5sum] = "83d6bee3e44d2a42c35e8c491d9736c8"
SRC_URI[sha256sum] = "747f590ed065830bd6d9c89df52e85aa0313297a7eae2738d5279d8c697ed2f6"

S = "${WORKDIR}/srfi-64-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
