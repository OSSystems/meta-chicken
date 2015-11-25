SECTION = "devel/chicken"
DESCRIPTION = "A library of streams"
LICENSE = "Artistic"
LIC_FILES_CHKSUM = "file://srfi-40.meta;md5=9e00ac54ad9d3610bc4ab1f1632f07bd"
DEPENDS_append_class-cross = " chicken-egg-records-cross chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-records-crosssdk chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-records nativesdk-chicken-egg-setup-helper chicken-egg-records-crosssdk chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-records chicken-egg-setup-helper chicken-egg-records-cross chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-records chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-40/srfi-40-${PV}.tar.gz"

SRC_URI[md5sum] = "9c041ef9ea0ae12a61041ddc8bebba16"
SRC_URI[sha256sum] = "41e29478d80284293c4dbbe329149ace02a59f077cfa9b8be575412cd049d0f1"

S = "${WORKDIR}/srfi-40-${PV}"

require chicken-egg-srfi-40.inc

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
