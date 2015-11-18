SECTION = "devel/chicken"
DESCRIPTION = "K-D tree implementation."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://kd-tree.meta;md5=7e28392f161de2fc8f0c101211713684"
DEPENDS_append_class-cross = " chicken-egg-datatype-cross chicken-egg-typeclass-cross chicken-egg-cis-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-datatype-crosssdk chicken-egg-typeclass-crosssdk chicken-egg-cis-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-datatype nativesdk-chicken-egg-typeclass nativesdk-chicken-egg-cis chicken-egg-datatype-crosssdk chicken-egg-typeclass-crosssdk chicken-egg-cis-crosssdk"
DEPENDS = " chicken-egg-datatype chicken-egg-typeclass chicken-egg-cis chicken-egg-datatype-cross chicken-egg-typeclass-cross chicken-egg-cis-cross"
RDEPENDS_${PN} = " chicken-egg-datatype chicken-egg-typeclass chicken-egg-cis"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/kd-tree/kd-tree-${PV}.tar.gz"

SRC_URI[md5sum] = "68f4b5d99b3e0a8d160c0bc7f54e193f"
SRC_URI[sha256sum] = "d73a7fb460d7eea59b41055077c1fb1ea25121dccb16b79d644ce50b2e3fac13"

S = "${WORKDIR}/kd-tree-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
