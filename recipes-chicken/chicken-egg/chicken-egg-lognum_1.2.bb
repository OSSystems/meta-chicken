SECTION = "devel/chicken"
DESCRIPTION = "Logarithmic number system."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://lognum.meta;md5=1d9237fe66b287f9b7cd85c2c57bfa8f"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross chicken-egg-datatype-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk chicken-egg-datatype-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable nativesdk-chicken-egg-datatype chicken-egg-matchable-crosssdk chicken-egg-datatype-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-datatype chicken-egg-matchable-cross chicken-egg-datatype-cross"
RDEPENDS_${PN} = " chicken-egg-matchable chicken-egg-datatype"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/lognum/lognum-${PV}.tar.gz"

SRC_URI[md5sum] = "8e4f83d5b379c909289d1cab15675792"
SRC_URI[sha256sum] = "09e3ebb8832ba33d0ad6c6bb1616df3ad3a0288136d48e275afcdf483e52df36"

S = "${WORKDIR}/lognum-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
