SECTION = "devel/chicken"
DESCRIPTION = "Xlib bindings"
LICENSE = "unknown"
LIC_FILES_CHKSUM = "file://xlib.meta;md5=8b010a58f7c074ab94f2a1d89833fcb3"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross libx11-native"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk libx11-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable nativesdk-chicken-egg-libx11 chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-matchable libx11 chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/xlib/xlib-${PV}.tar.gz"

SRC_URI[md5sum] = "381df68d4449034a45741952fe2fa737"
SRC_URI[sha256sum] = "3390d22ecb5c28a9587c87931affdfc4d185798e851cc6d4ff18672b0e5ca4fe"

S = "${WORKDIR}/xlib-${PV}"

require chicken-egg-xlib.inc

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
