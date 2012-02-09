SECTION = "devel/chicken"
DESCRIPTION = "Bindings to the OpenSSL SSL/TLS library"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://openssl.meta;md5=e9ffa5abea8ae6526bc8045a8cb2aa4b"
DEPENDS_virtclass-cross += "openssl-native"
DEPENDS += "openssl"

inherit chicken_install

BBCLASSEXTEND = "cross"
