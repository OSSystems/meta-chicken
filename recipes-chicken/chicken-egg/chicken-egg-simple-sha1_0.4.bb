SECTION = "devel/chicken"
DESCRIPTION = "A fast and simple SHA1 implementation with minimal dependencies"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://simple-sha1.meta;md5=5cb3ab517d8a2a51b0278b4f74bc7525"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/simple-sha1/simple-sha1-${PV}.tar.gz"

SRC_URI[md5sum] = "ffebd56ca2bffbb5e73329d0278a311e"
SRC_URI[sha256sum] = "4bdd9f3f6893953a87be20398abb936e9e4c098a95a2484b19b59a2467080f2e"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
