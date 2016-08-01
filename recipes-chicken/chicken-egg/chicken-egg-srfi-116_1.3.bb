SECTION = "devel/chicken"
DESCRIPTION = "Immutable Lists."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-116.meta;md5=dade95b56e2f12767e74dee0f70e56bc"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-116/srfi-116-${PV}.tar.gz"

SRC_URI[md5sum] = "f7856a5475b8cd4b2c406ce16b73d0b2"
SRC_URI[sha256sum] = "e79c44077f6dc30e555feda67c973ba3e0270ace461846288c2caed10e48943e"

S = "${WORKDIR}/srfi-116-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
