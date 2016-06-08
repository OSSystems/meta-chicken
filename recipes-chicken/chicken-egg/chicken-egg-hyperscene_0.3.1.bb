SECTION = "devel/chicken"
DESCRIPTION = "Scene graph and spatial partitioning"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://hyperscene.meta;md5=4e6bc2c51b61dbc986001f43d6752395"
DEPENDS_append_class-cross = " chicken-egg-miscmacros-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-miscmacros-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-miscmacros chicken-egg-miscmacros-crosssdk"
DEPENDS = " chicken-egg-miscmacros chicken-egg-miscmacros-cross"
RDEPENDS_${PN} = " chicken-egg-miscmacros"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/hyperscene/hyperscene-${PV}.tar.gz"

SRC_URI[md5sum] = "8b846f2e4f51f5b7f0d1ca88e4c46fae"
SRC_URI[sha256sum] = "47ef4a3a5403201f52d835dee7a4c73a8e22aa08890802c370af82d029645662"

S = "${WORKDIR}/hyperscene-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
