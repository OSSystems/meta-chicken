SECTION = "devel/chicken"
DESCRIPTION = "Determine the separation vertices of a graph."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://graph-separators.meta;md5=08014611ffb31f81475d82376f0377a2"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/graph-separators/graph-separators-${PV}.tar.gz"

SRC_URI[md5sum] = "0270083b17320b95d63d642a0d054bba"
SRC_URI[sha256sum] = "79e9707b6598f9d0fb9b120e29a464ae7509314b11f23b0c834b3dde3a6d7cd7"

S = "${WORKDIR}/graph-separators-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
