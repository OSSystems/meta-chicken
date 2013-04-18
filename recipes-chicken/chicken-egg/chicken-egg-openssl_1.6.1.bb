SECTION = "devel/chicken"
DESCRIPTION = "Bindings to the OpenSSL SSL/TLS library"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://openssl.meta;md5=e9ffa5abea8ae6526bc8045a8cb2aa4b"
DEPENDS_virtclass-cross += "openssl-native"
DEPENDS += "openssl"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "5d7409d99eb5150b09d4671577d99e33"
SRC_URI[sha256sum] = "6831b23a81c8b5b0dc4f524117a9ddd7a8aa7fa8086956e23e0c0fd38f20ac18"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
