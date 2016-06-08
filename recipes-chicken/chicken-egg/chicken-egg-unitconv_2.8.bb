SECTION = "devel/chicken"
DESCRIPTION = "Conversion of units of measurement"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://unitconv.meta;md5=744c40bd6ea09fe9ee7b5f75dbd21bf5"
DEPENDS_append_class-cross = " chicken-egg-datatype-cross chicken-egg-matchable-cross chicken-egg-numbers-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-datatype-crosssdk chicken-egg-matchable-crosssdk chicken-egg-numbers-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-datatype nativesdk-chicken-egg-matchable nativesdk-chicken-egg-numbers chicken-egg-datatype-crosssdk chicken-egg-matchable-crosssdk chicken-egg-numbers-crosssdk"
DEPENDS = " chicken-egg-datatype chicken-egg-matchable chicken-egg-numbers chicken-egg-datatype-cross chicken-egg-matchable-cross chicken-egg-numbers-cross chicken-egg-unitconv-cross"
RDEPENDS_${PN} = " chicken-egg-datatype chicken-egg-matchable chicken-egg-numbers"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/unitconv/unitconv-${PV}.tar.gz"

SRC_URI[md5sum] = "330f9c9e5f8bde83ae8dec96ad3049b4"
SRC_URI[sha256sum] = "2685acebec5c0f79ba0ad0bdf08d265ee5f0860622bdf37ebd449a885dc286cc"

S = "${WORKDIR}/unitconv-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
