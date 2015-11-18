SECTION = "devel/chicken"
DESCRIPTION = "Compute static single assignment form of a graph."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://graph-ssa.meta;md5=6e84de2a98da88ea773b2a92de41e47d"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross chicken-egg-graph-dominators-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk chicken-egg-graph-dominators-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable nativesdk-chicken-egg-graph-dominators chicken-egg-matchable-crosssdk chicken-egg-graph-dominators-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-graph-dominators chicken-egg-matchable-cross chicken-egg-graph-dominators-cross"
RDEPENDS_${PN} = " chicken-egg-matchable chicken-egg-graph-dominators"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/graph-ssa/graph-ssa-${PV}.tar.gz"

SRC_URI[md5sum] = "db6d6d2abc61387a5fc1de0dbd2b6167"
SRC_URI[sha256sum] = "362db6b578d589c5a441a855618fe0829e97143c8b9415936a47794167705fbd"

S = "${WORKDIR}/graph-ssa-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
