SECTION = "devel/chicken"
DESCRIPTION = "A simple and flexible command-line option parsing facility"
LICENSE = "SRFI"
LIC_FILES_CHKSUM = "file://srfi-37.meta;md5=dd8d33915fedf2377e86018eb184ec87"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-37/srfi-37-${PV}.tar.gz"

SRC_URI[md5sum] = "87e0b969a1b0482bd108ec69b89d3256"
SRC_URI[sha256sum] = "0292c10e4c8f1a024c904f4a6bf1ce8d7e416f0a26456e2c7feb3b7e242a0ee7"

S = "${WORKDIR}/srfi-37-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
