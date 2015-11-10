SECTION = "devel/chicken"
DESCRIPTION = "Secure password hashing through the Unix crypt() function"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://crypt.meta;md5=fed18e44b5d9d5abf1ab1d7aae2b8c1e"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/crypt/crypt-${PV}.tar.gz"

SRC_URI[md5sum] = "947900ca8c48d3e0e3cf8a6c225dcc8d"
SRC_URI[sha256sum] = "27c22fe2ed63c9ec756a79d6647363c85c01eba2437a0b1a4cf2256a07a865e3"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
