SECTION = "devel/chicken"
DESCRIPTION = "TAR file format packing and unpacking."
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://snowtar.meta;md5=1c0ed9b6ea8127ce09058d81cc44e1f9"
DEPENDS_append_class-cross = " chicken-egg-miscmacros-cross chicken-egg-numbers-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-miscmacros-crosssdk chicken-egg-numbers-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-numbers chicken-egg-miscmacros-crosssdk chicken-egg-numbers-crosssdk"
DEPENDS = " chicken-egg-miscmacros chicken-egg-numbers chicken-egg-miscmacros-cross chicken-egg-numbers-cross"
RDEPENDS_${PN} = " chicken-egg-miscmacros chicken-egg-numbers"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/snowtar/snowtar-${PV}.tar.gz"

SRC_URI[md5sum] = "86115e1b12d2e8cea3a912d8b2a7bf97"
SRC_URI[sha256sum] = "fe83ef7bd96cec9118509498dcb5175948e442637730b44ec23e72c092015480"

S = "${WORKDIR}/snowtar-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
