SECTION = "devel/chicken"
DESCRIPTION = "Compute strongly-connected components (SCC) of a graph."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://graph-scc.meta;md5=183c5d2248949a4efb8c99b8fb1fde84"
DEPENDS_append_class-cross = " chicken-egg-iset-cross chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-iset-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-iset nativesdk-chicken-egg-matchable chicken-egg-iset-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-iset chicken-egg-matchable chicken-egg-iset-cross chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-iset chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/graph-scc/graph-scc-${PV}.tar.gz"

SRC_URI[md5sum] = "1628dcf5101cede34cca1423edb95c22"
SRC_URI[sha256sum] = "41a44136737f0595c086e059314c4b3f9b9d5a746036abfa5f734fe0991914c7"

S = "${WORKDIR}/graph-scc-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
