SECTION = "devel/chicken"
DESCRIPTION = "SRFI-71: Extended LET-syntax for multiple values"
LICENSE = "SRFI"
LIC_FILES_CHKSUM = "file://srfi-71.meta;md5=a1fcc499b651ea2e6146ee34b43974a6"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-71/srfi-71-${PV}.tar.gz"

SRC_URI[md5sum] = "b512ef320511cf2a48a1b98ae2683a68"
SRC_URI[sha256sum] = "e5065c5181cecd955105e7f1f23b2d74504fa111b45be0e76b53f62b6a8c75a8"

S = "${WORKDIR}/srfi-71-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
