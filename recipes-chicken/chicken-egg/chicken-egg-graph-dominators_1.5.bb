SECTION = "devel/chicken"
DESCRIPTION = "Find immediate dominators in a directed graph."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://graph-dominators.meta;md5=f0798b33fe21fb00894ab56f3ee3e6a2"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/graph-dominators/graph-dominators-${PV}.tar.gz"

SRC_URI[md5sum] = "e4522a7f6d368d1260253ecc945b17a9"
SRC_URI[sha256sum] = "212519140a2635bf54cb1417965e1686bc2f1429628e0e856b3a9d526a2f2168"

S = "${WORKDIR}/graph-dominators-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
