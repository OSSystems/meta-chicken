SECTION = "devel/chicken"
DESCRIPTION = "A slicer procedure for lists, strings and vectors"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://slice.meta;md5=9883c865618652b3411623c87afeb303"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "b365e4f92cb9988dd5bd52ff9b27b331"
SRC_URI[sha256sum] = "866a91e4d64e9fe19796c7df7ccfb1076f0927a6ee7673fbc5ccff1d777edc81"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
