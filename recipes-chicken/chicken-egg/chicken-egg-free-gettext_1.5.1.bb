SECTION = "devel/chicken"
DESCRIPTION = "Binary-compatible flexible gettext reimplementation"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://free-gettext.meta;md5=e9522ab8b41f83507a9b9ed62bdd9b26"
DEPENDS_virtclass-cross += "chicken-egg-charconv-cross"
DEPENDS += "chicken-egg-charconv chicken-egg-charconv-cross"
RDEPENDS_${PN} += "chicken-egg-charconv"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "6235a4619bb798d8080f36effec9d8e5"
SRC_URI[sha256sum] = "f4f2a29c3c789f41655e0e16363f708e8a3d059f00027318e80630e840199ce5"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
