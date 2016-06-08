SECTION = "devel/chicken"
DESCRIPTION = "Directed graph in adjacency list format."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://digraph.meta;md5=7824f3b3ba719685a91b75c7a6a7d703"
DEPENDS_append_class-cross = " chicken-egg-dyn-vector-cross chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-dyn-vector-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-dyn-vector nativesdk-chicken-egg-matchable chicken-egg-dyn-vector-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-dyn-vector chicken-egg-matchable chicken-egg-dyn-vector-cross chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-dyn-vector chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/digraph/digraph-${PV}.tar.gz"

SRC_URI[md5sum] = "d10f4d4a1136999eb0486036146b7423"
SRC_URI[sha256sum] = "255011f861581522ad607f3fab5b05df244e3c9728e8874b0de8b8b02a70e5f3"

S = "${WORKDIR}/digraph-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
