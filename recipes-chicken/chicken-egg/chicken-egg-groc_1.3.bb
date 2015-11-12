SECTION = "devel/chicken"
DESCRIPTION = "Generic interface for two-dimensional graphics output."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://groc.meta;md5=96bdc77556a563011c18fd23bf730a87"
DEPENDS_append_class-cross = " chicken-egg-datatype-cross chicken-egg-typeclass-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-datatype-crosssdk chicken-egg-typeclass-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-datatype nativesdk-chicken-egg-typeclass chicken-egg-datatype-crosssdk chicken-egg-typeclass-crosssdk"
DEPENDS = " chicken-egg-datatype chicken-egg-typeclass chicken-egg-datatype-cross chicken-egg-typeclass-cross"
RDEPENDS_${PN} = " chicken-egg-datatype chicken-egg-typeclass"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/groc/groc-${PV}.tar.gz"

SRC_URI[md5sum] = "68592e0e42385f1c214f04c489257acb"
SRC_URI[sha256sum] = "8faca449887ce1bcbd270517cf5b8b2c9f213d1daca80098271adc4d53ee52fd"

S = "${WORKDIR}/groc-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
