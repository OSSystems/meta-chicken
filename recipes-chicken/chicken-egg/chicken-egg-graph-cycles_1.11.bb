SECTION = "devel/chicken"
DESCRIPTION = "Enumerate all simple cycles in a graph."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://graph-cycles.meta;md5=fa6d169939957cbd3c50d3609077566e"
DEPENDS_append_class-cross = " chicken-egg-iset-cross chicken-egg-matchable-cross chicken-egg-graph-scc-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-iset-crosssdk chicken-egg-matchable-crosssdk chicken-egg-graph-scc-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-iset nativesdk-chicken-egg-matchable nativesdk-chicken-egg-graph-scc chicken-egg-iset-crosssdk chicken-egg-matchable-crosssdk chicken-egg-graph-scc-crosssdk"
DEPENDS = " chicken-egg-iset chicken-egg-matchable chicken-egg-graph-scc chicken-egg-iset-cross chicken-egg-matchable-cross chicken-egg-graph-scc-cross"
RDEPENDS_${PN} = " chicken-egg-iset chicken-egg-matchable chicken-egg-graph-scc"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/graph-cycles/graph-cycles-${PV}.tar.gz"

SRC_URI[md5sum] = "60a84df5c55f29e3069dfe420313cf00"
SRC_URI[sha256sum] = "4d2d70ca04dbb90799b9e6afa714b0ebedcd7e7f618f1f43a6f93b7be79c0188"

S = "${WORKDIR}/graph-cycles-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
