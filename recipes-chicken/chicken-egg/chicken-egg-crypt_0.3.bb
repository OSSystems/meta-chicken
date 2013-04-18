SECTION = "devel/chicken"
DESCRIPTION = "Secure password hashing through the Unix crypt() function"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://crypt.meta;md5=fed18e44b5d9d5abf1ab1d7aae2b8c1e"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "9a2573cbe891976a04d6bc04af88e93f"
SRC_URI[sha256sum] = "8cba749f8c16023ac4e11220e77351f1ef710c96bda93d60fd652ba806a01b8d"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
