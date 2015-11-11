SECTION = "devel/chicken"
DESCRIPTION = "Bindings to the OpenSSL SSL/TLS library"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://openssl.meta;md5=e9ffa5abea8ae6526bc8045a8cb2aa4b"
DEPENDS_append_class-cross = " openssl-native"
DEPENDS_append_class-crosssdk = " openssl-native"
DEPENDS = " openssl"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/openssl/openssl-${PV}.tar.gz"

SRC_URI[md5sum] = "bca5006df122e8bf2e898ec05cde5eda"
SRC_URI[sha256sum] = "b48d40bd7f12639d6408443444faf536cc8731870c919bb1090bbb8ad66e5147"

S = "${WORKDIR}/openssl-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
