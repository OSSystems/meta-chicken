SECTION = "devel/chicken"
DESCRIPTION = "Directed graph based on adjacency intervals."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://interval-digraph.meta;md5=9e5e2cbf990f8d77241b074a04630847"
DEPENDS_append_class-cross = " chicken-egg-cis-cross chicken-egg-rb-tree-cross chicken-egg-typeclass-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-cis-crosssdk chicken-egg-rb-tree-crosssdk chicken-egg-typeclass-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-cis nativesdk-chicken-egg-rb-tree nativesdk-chicken-egg-typeclass chicken-egg-cis-crosssdk chicken-egg-rb-tree-crosssdk chicken-egg-typeclass-crosssdk"
DEPENDS = " chicken-egg-cis chicken-egg-rb-tree chicken-egg-typeclass chicken-egg-cis-cross chicken-egg-rb-tree-cross chicken-egg-typeclass-cross"
RDEPENDS_${PN} = " chicken-egg-cis chicken-egg-rb-tree chicken-egg-typeclass"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/interval-digraph/interval-digraph-${PV}.tar.gz"

SRC_URI[md5sum] = "349b5bddc2391a5b649b78d8df6d173b"
SRC_URI[sha256sum] = "c3763d6aee9f06db6ece712c8caf2ecabebbb17fb77aab02714764a7b4563936"

S = "${WORKDIR}/interval-digraph-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
