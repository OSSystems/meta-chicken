SECTION = "devel/chicken"
DESCRIPTION = "Bindings to the OpenSSL SSL/TLS library"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://openssl.meta;md5=e9ffa5abea8ae6526bc8045a8cb2aa4b"
DEPENDS_virtclass-cross += "openssl-native"
DEPENDS += "openssl"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "9e98febad2b4a74855d188d0192d945f"
SRC_URI[sha256sum] = "7dc9f9eaa62731ae7069709f61df33548f8ba803a9f89d9ce27353a404528bea"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
