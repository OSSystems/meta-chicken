SECTION = "devel/chicken"
DESCRIPTION = "Hygienic MATCH replacement"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://matchable.meta;md5=7339f5d3f4c35990b880102f418a94be"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/matchable/matchable-${PV}.tar.gz"

SRC_URI[md5sum] = "78834dc831f9da1a35cee6b6d3b52e25"
SRC_URI[sha256sum] = "3e93a9189ec8bed3f819b5c3702c4d0e8a1145fc875f5a7b4deebc275f5da73b"

S = "${WORKDIR}/matchable-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
