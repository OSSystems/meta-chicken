SECTION = "devel/chicken"
DESCRIPTION = "Provides combinatorial graphs, digraphs, multigraphs, and multidigraphs."
LICENSE = "BSD3"
LIC_FILES_CHKSUM = "file://graphs.meta;md5=736104763d212fc499c4709593d40100"
DEPENDS_append_class-cross = " chicken-egg-arrays-cross chicken-egg-coops-cross chicken-egg-hahn-cross chicken-egg-lazy-seq-cross chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-arrays-crosssdk chicken-egg-coops-crosssdk chicken-egg-hahn-crosssdk chicken-egg-lazy-seq-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-arrays nativesdk-chicken-egg-coops nativesdk-chicken-egg-hahn nativesdk-chicken-egg-lazy-seq nativesdk-chicken-egg-matchable chicken-egg-arrays-crosssdk chicken-egg-coops-crosssdk chicken-egg-hahn-crosssdk chicken-egg-lazy-seq-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-arrays chicken-egg-coops chicken-egg-hahn chicken-egg-lazy-seq chicken-egg-matchable chicken-egg-arrays-cross chicken-egg-coops-cross chicken-egg-hahn-cross chicken-egg-lazy-seq-cross chicken-egg-matchable-cross chicken-egg-graphs-cross"
RDEPENDS_${PN} = " chicken-egg-arrays chicken-egg-coops chicken-egg-hahn chicken-egg-lazy-seq chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/graphs/graphs-${PV}.tar.gz"

SRC_URI[md5sum] = "362a8b268bccf148c1c0f214fe9c5ad1"
SRC_URI[sha256sum] = "bce32c4700b4268ac76f3419b0ebb5ed389e3c017f85468cf560eebf31ee8a56"

S = "${WORKDIR}/graphs-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
