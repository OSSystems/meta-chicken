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

SRC_URI[md5sum] = "52d02167cc725227b939bed88611e8a2"
SRC_URI[sha256sum] = "3a3e27dd1f05d5e12fbba8f5b1a4cde7906e22529855eb46cb230f57c31b0caf"

S = "${WORKDIR}/hyperscene-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
