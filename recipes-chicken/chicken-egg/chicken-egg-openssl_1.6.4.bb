SECTION = "devel/chicken"
DESCRIPTION = "Bindings to the OpenSSL SSL/TLS library"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://openssl.meta;md5=e9ffa5abea8ae6526bc8045a8cb2aa4b"
DEPENDS_virtclass-cross += "openssl-native"
DEPENDS += "openssl"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "81636b64b578aea9274e0c30b615f7f7"
SRC_URI[sha256sum] = "9336f02fdcf5993760429dee35979d84f4834ad28e6330e6411321f9d144072a"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
