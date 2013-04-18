SECTION = "devel/chicken"
DESCRIPTION = "A fast and simple SHA1 implementation with minimal dependencies"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://simple-sha1.meta;md5=5cb3ab517d8a2a51b0278b4f74bc7525"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "d8cbd5ffefea8bfe4b2ef2fa02278aa9"
SRC_URI[sha256sum] = "b1f4ac9434b6062f84e72b8158f95bcb10e122b33b6acca0535bb3ef33710d4a"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
