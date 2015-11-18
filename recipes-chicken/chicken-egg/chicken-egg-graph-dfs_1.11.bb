SECTION = "devel/chicken"
DESCRIPTION = "Depth-first search in a graph."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://graph-dfs.meta;md5=7ee41bbaea0bb8b748cc63ba3b573928"
DEPENDS_append_class-cross = " chicken-egg-iset-cross chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-iset-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-iset nativesdk-chicken-egg-matchable chicken-egg-iset-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-iset chicken-egg-matchable chicken-egg-iset-cross chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-iset chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/graph-dfs/graph-dfs-${PV}.tar.gz"

SRC_URI[md5sum] = "1ba5744d9299914bac7f7999a392fb4b"
SRC_URI[sha256sum] = "5664dd2bd6272fdf516f07b5821d2ba8cbc84a73c83901e133996fc1932ce991"

S = "${WORKDIR}/graph-dfs-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
