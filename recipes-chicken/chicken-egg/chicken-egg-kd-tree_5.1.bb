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

SRC_URI[md5sum] = "ae3f270b80ba832937c74be5a1f1f284"
SRC_URI[sha256sum] = "95a28624723bd644319b82aa5e4b6be5f6e199bef799e89a19e67ae5c8d3c90a"

S = "${WORKDIR}/kd-tree-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
