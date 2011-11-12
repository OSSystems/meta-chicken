inherit chicken_install

SECTION = "devel/chicken"
DESCRIPTION = "Bindings to the OpenSSL SSL/TLS library"
DEPENDS_virtclass-cross += "chicken-cross openssl-native"
DEPENDS += "chicken openssl"

BBCLASSEXTEND = "cross"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://openssl.meta;md5=e9ffa5abea8ae6526bc8045a8cb2aa4b"
