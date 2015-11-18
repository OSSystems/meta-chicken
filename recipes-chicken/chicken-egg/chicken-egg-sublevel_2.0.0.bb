SECTION = "devel/chicken"
DESCRIPTION = "Namespaced access to leveldb implementations"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sublevel.meta;md5=c1c9196781b2f4bc0c7774ef4ba6bcc1"
DEPENDS_append_class-cross = " chicken-egg-utf8-cross chicken-egg-level-cross chicken-egg-interfaces-cross chicken-egg-lazy-seq-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-utf8-crosssdk chicken-egg-level-crosssdk chicken-egg-interfaces-crosssdk chicken-egg-lazy-seq-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-utf8 nativesdk-chicken-egg-level nativesdk-chicken-egg-interfaces nativesdk-chicken-egg-lazy-seq chicken-egg-utf8-crosssdk chicken-egg-level-crosssdk chicken-egg-interfaces-crosssdk chicken-egg-lazy-seq-crosssdk"
DEPENDS = " chicken-egg-utf8 chicken-egg-level chicken-egg-interfaces chicken-egg-lazy-seq chicken-egg-utf8-cross chicken-egg-level-cross chicken-egg-interfaces-cross chicken-egg-lazy-seq-cross"
RDEPENDS_${PN} = " chicken-egg-utf8 chicken-egg-level chicken-egg-interfaces chicken-egg-lazy-seq"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sublevel/sublevel-${PV}.tar.gz"

SRC_URI[md5sum] = "92fbb7b5f1b67011d4643e92a2267e34"
SRC_URI[sha256sum] = "a67cf24ca72c6695b7495d0e182b59cdb895a695522d9ac5495c1207edeac4b8"

S = "${WORKDIR}/sublevel-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
