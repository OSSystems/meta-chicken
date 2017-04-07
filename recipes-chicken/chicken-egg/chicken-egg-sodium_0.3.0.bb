SECTION = "devel/chicken"
DESCRIPTION = "Bindings to the Sodium crypto library (libsodium)"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://sodium.meta;md5=2758a43209441659e682205571882776"
DEPENDS_append_class-cross = " libsodium-native"
DEPENDS_append_class-crosssdk = " libsodium-native"
DEPENDS_append_class-nativesdk = " nativesdk-libsodium"
DEPENDS = " libsodium"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sodium/sodium-${PV}.tar.gz"

SRC_URI[md5sum] = "21deee508181b33b371a71d92110c1a8"
SRC_URI[sha256sum] = "0fa373a9c52c973791ac760fa398d8d1d1fdd37664a9eb213a3dfd197624db23"

S = "${WORKDIR}/sodium-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
