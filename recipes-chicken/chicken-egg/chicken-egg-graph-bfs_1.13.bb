SECTION = "devel/chicken"
DESCRIPTION = "Breadth-first search in a graph."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://graph-bfs.meta;md5=4888b4a520f2979990f022b3b6c60e69"
DEPENDS_append_class-cross = " chicken-egg-iset-cross chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-iset-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-iset nativesdk-chicken-egg-matchable chicken-egg-iset-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-iset chicken-egg-matchable chicken-egg-iset-cross chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-iset chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/graph-bfs/graph-bfs-${PV}.tar.gz"

SRC_URI[md5sum] = "0542b5b98fac039344ddddf5b0a6d2f1"
SRC_URI[sha256sum] = "1a91e60b7050b0eff6a262389fd0bad29e6afe81dcc8feb2b95096bfbd232a50"

S = "${WORKDIR}/graph-bfs-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
