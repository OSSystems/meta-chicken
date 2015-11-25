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

SRC_URI[md5sum] = "015ecc7fdea57b8946990067aa8a7725"
SRC_URI[sha256sum] = "4e013e199a9999fd4a9f1cca6bd535a3e5cfa56357a5400dfa33bdef7c8fead5"

S = "${WORKDIR}/srfi-95-${PV}"

require chicken-egg-srfi-95.inc

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
