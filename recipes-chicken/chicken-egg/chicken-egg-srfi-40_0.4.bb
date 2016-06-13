SECTION = "devel/chicken"
DESCRIPTION = "A library of streams"
LICENSE = "Artistic-1.0"
LIC_FILES_CHKSUM = "file://srfi-40.meta;md5=9e00ac54ad9d3610bc4ab1f1632f07bd"
DEPENDS_append_class-cross = " chicken-egg-records-cross chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-records-crosssdk chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-records nativesdk-chicken-egg-setup-helper chicken-egg-records-crosssdk chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-records chicken-egg-setup-helper chicken-egg-records-cross chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-records chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-40/srfi-40-${PV}.tar.gz"

SRC_URI[md5sum] = "894d36cf1200633f2b2378877c73cd78"
SRC_URI[sha256sum] = "66fceaa621fba628f06aa6d3b15405e49b90fe05f18ae4451506d808d5ac7b10"

S = "${WORKDIR}/srfi-40-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
