SECTION = "devel/chicken"
DESCRIPTION = "An implementation of the suffix tree data structure."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://suffix-tree.meta;md5=0600eee9df3eb454d7b86fc64c2ab87b"
DEPENDS_append_class-cross = " chicken-egg-datatype-cross chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-datatype-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-datatype nativesdk-chicken-egg-matchable chicken-egg-datatype-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-datatype chicken-egg-matchable chicken-egg-datatype-cross chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-datatype chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/suffix-tree/suffix-tree-${PV}.tar.gz"

SRC_URI[md5sum] = "2479b7f292098faa60a14e372a6e8989"
SRC_URI[sha256sum] = "edb89227dce5df7490353193ce1133416dc29cdc3a4cce79e5194205a0d08f9d"

S = "${WORKDIR}/suffix-tree-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
