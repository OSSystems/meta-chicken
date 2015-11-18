SECTION = "devel/chicken"
DESCRIPTION = "Prints a graph in various formats."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://format-graph.meta;md5=84441b2dc25afea303637b480ce8475d"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/format-graph/format-graph-${PV}.tar.gz"

SRC_URI[md5sum] = "e48c28dec9ccc1f0b61d2eb37088d017"
SRC_URI[sha256sum] = "eccd03ecf4f27f88fe334d7bc895ecb5641fecb84edc93f7fb10b9067fa65965"

S = "${WORKDIR}/format-graph-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
