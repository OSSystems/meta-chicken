SECTION = "devel/chicken"
DESCRIPTION = "Output text diff scripts in different formats"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://format-textdiff.meta;md5=233bc1e87700bf1ac66697c0311989fe"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross chicken-egg-npdiff-cross chicken-egg-vector-lib-cross chicken-egg-dyn-vector-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk chicken-egg-npdiff-crosssdk chicken-egg-vector-lib-crosssdk chicken-egg-dyn-vector-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable nativesdk-chicken-egg-npdiff nativesdk-chicken-egg-vector-lib nativesdk-chicken-egg-dyn-vector chicken-egg-matchable-crosssdk chicken-egg-npdiff-crosssdk chicken-egg-vector-lib-crosssdk chicken-egg-dyn-vector-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-npdiff chicken-egg-vector-lib chicken-egg-dyn-vector chicken-egg-matchable-cross chicken-egg-npdiff-cross chicken-egg-vector-lib-cross chicken-egg-dyn-vector-cross"
RDEPENDS_${PN} = " chicken-egg-matchable chicken-egg-npdiff chicken-egg-vector-lib chicken-egg-dyn-vector"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/format-textdiff/format-textdiff-${PV}.tar.gz"

SRC_URI[md5sum] = "f65e63fb2bfd77cb91fff80ae391ca38"
SRC_URI[sha256sum] = "64dcac444728e9f821788c5dfa165007f7160265cd0687b0e65ae817a04aeefe"

S = "${WORKDIR}/format-textdiff-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
