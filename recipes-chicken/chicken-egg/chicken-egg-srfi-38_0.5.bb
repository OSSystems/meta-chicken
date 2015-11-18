SECTION = "devel/chicken"
DESCRIPTION = "A Chicken version of the SRFI-38 reference implementation"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://srfi-38.meta;md5=368a8213574739465863736def1e5c73"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-38/srfi-38-${PV}.tar.gz"

SRC_URI[md5sum] = "7be7208daa8079c3d4a5c44e20178829"
SRC_URI[sha256sum] = "3b4ea5fd71bf8ed25b2a8fbdb156db842a3d8bef3204dc255681a5e9aff31a7e"

S = "${WORKDIR}/srfi-38-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
