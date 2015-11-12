SECTION = "devel/chicken"
DESCRIPTION = "Some Graphviz abstractions"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://graphviz.meta;md5=9bc3e244b0b14736c784b241060c85cd"
DEPENDS_append_class-cross = " chicken-egg-hahn-cross chicken-egg-matchable-cross chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-hahn-crosssdk chicken-egg-matchable-crosssdk chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-hahn nativesdk-chicken-egg-matchable nativesdk-chicken-egg-setup-helper chicken-egg-hahn-crosssdk chicken-egg-matchable-crosssdk chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-hahn chicken-egg-matchable chicken-egg-setup-helper chicken-egg-hahn-cross chicken-egg-matchable-cross chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-hahn chicken-egg-matchable chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/graphviz/graphviz-${PV}.tar.gz"

SRC_URI[md5sum] = "62675a0b0abf38cf272d14bdde3d5ceb"
SRC_URI[sha256sum] = "187cfc83cc387fb62685347b95ab6115eb793930e491288b754726a822b801d0"

S = "${WORKDIR}/graphviz-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
