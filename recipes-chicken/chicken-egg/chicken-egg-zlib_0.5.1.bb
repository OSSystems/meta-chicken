SECTION = "devel/chicken"
DESCRIPTION = "Bindings for zlib"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://zlib.meta;md5=958a6d4acb3753f1566be93a083c9e24"
DEPENDS_append_class-cross = " chicken-egg-foreigners-cross chicken-egg-miscmacros-cross zlib-native"
DEPENDS_append_class-crosssdk = " chicken-egg-foreigners-crosssdk chicken-egg-miscmacros-crosssdk zlib-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-foreigners nativesdk-chicken-egg-miscmacros nativesdk-zlib chicken-egg-foreigners-crosssdk chicken-egg-miscmacros-crosssdk"
DEPENDS = " chicken-egg-foreigners chicken-egg-miscmacros zlib chicken-egg-foreigners-cross chicken-egg-miscmacros-cross"
RDEPENDS_${PN} = " chicken-egg-foreigners chicken-egg-miscmacros"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/zlib/zlib-${PV}.tar.gz"

SRC_URI[md5sum] = "40a07b2fc09b5b0650ab861dc0485e94"
SRC_URI[sha256sum] = "72fab5de2947e96505d48c34499f9f0397d514d7e4e708ce77a998736a93f5a4"

S = "${WORKDIR}/zlib-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
