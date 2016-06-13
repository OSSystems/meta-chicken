SECTION = "devel/chicken"
DESCRIPTION = "Sorting and merging"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://srfi-95.meta;md5=f8e5c7c392af783957e7a4d28706e9d6"
DEPENDS_append_class-cross = " chicken-egg-srfi-63-cross chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-srfi-63-crosssdk chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-srfi-63 nativesdk-chicken-egg-setup-helper chicken-egg-srfi-63-crosssdk chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-srfi-63 chicken-egg-setup-helper chicken-egg-srfi-63-cross chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-srfi-63 chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-95/srfi-95-${PV}.tar.gz"

SRC_URI[md5sum] = "2dee3c53cedb63213b35db1193c7d49b"
SRC_URI[sha256sum] = "3286afa63c49af5e951552735c99a75e665863253a0aa898d8df0b38bf14aad9"

S = "${WORKDIR}/srfi-95-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
