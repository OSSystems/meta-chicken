SECTION = "devel/chicken"
DESCRIPTION = "Various spatial tree implementations."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://spatial-trees.meta;md5=508d3d0943838060f9859c85332c3c1a"
DEPENDS_append_class-cross = " chicken-egg-datatype-cross chicken-egg-typeclass-cross chicken-egg-cis-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-datatype-crosssdk chicken-egg-typeclass-crosssdk chicken-egg-cis-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-datatype nativesdk-chicken-egg-typeclass nativesdk-chicken-egg-cis chicken-egg-datatype-crosssdk chicken-egg-typeclass-crosssdk chicken-egg-cis-crosssdk"
DEPENDS = " chicken-egg-datatype chicken-egg-typeclass chicken-egg-cis chicken-egg-datatype-cross chicken-egg-typeclass-cross chicken-egg-cis-cross"
RDEPENDS_${PN} = " chicken-egg-datatype chicken-egg-typeclass chicken-egg-cis"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/spatial-trees/spatial-trees-${PV}.tar.gz"

SRC_URI[md5sum] = "80092fed2522600f2ad558609cf0ff9c"
SRC_URI[sha256sum] = "6408dc3416297d6516b2bbec2782282586a2043f73ab050c33c2c5ce50cb6383"

S = "${WORKDIR}/spatial-trees-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
