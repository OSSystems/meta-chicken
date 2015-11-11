SECTION = "devel/chicken"
DESCRIPTION = "Integer sets"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://iset.meta;md5=a59c0385ec4ebde61870d7394ae6d3bb"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/iset/iset-${PV}.tar.gz"

SRC_URI[md5sum] = "f197971409ca02b742f83ea23d21b635"
SRC_URI[sha256sum] = "0791a89057d3f48d84d4ab0945c1133c025b530cf6590b1e36467991e24a6276"

S = "${WORKDIR}/iset-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
