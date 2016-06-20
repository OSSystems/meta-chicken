SECTION = "devel/chicken"
DESCRIPTION = "A sorted dictionary data structure based on red-black trees."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://rb-tree.meta;md5=6282a3b21b63ca0ebaac4602b4a0c1dc"
DEPENDS_append_class-cross = " chicken-egg-datatype-cross chicken-egg-matchable-cross chicken-egg-typeclass-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-datatype-crosssdk chicken-egg-matchable-crosssdk chicken-egg-typeclass-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-datatype nativesdk-chicken-egg-matchable nativesdk-chicken-egg-typeclass chicken-egg-datatype-crosssdk chicken-egg-matchable-crosssdk chicken-egg-typeclass-crosssdk"
DEPENDS = " chicken-egg-datatype chicken-egg-matchable chicken-egg-typeclass chicken-egg-datatype-cross chicken-egg-matchable-cross chicken-egg-typeclass-cross"
RDEPENDS_${PN} = " chicken-egg-datatype chicken-egg-matchable chicken-egg-typeclass"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/rb-tree/rb-tree-${PV}.tar.gz"

SRC_URI[md5sum] = "2e5ebb2d06ef6a55b9f955aef76fca03"
SRC_URI[sha256sum] = "fcf304d35743717db5bfc13c5fb6f40423f3045d96fe8283e08977fff2622fde"

S = "${WORKDIR}/rb-tree-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
