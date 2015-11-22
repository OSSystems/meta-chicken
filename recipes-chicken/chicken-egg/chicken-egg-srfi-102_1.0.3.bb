SECTION = "devel/chicken"
DESCRIPTION = "Procedure Introspection (From Draft SRFI 102)"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-102.meta;md5=16343450eaa3834fcd5a8ca7157c03dd"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-setup-helper-cross chicken-egg-srfi-102-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-102/srfi-102-${PV}.tar.gz"

SRC_URI[md5sum] = "3f4525f420ad329364628904d5508c13"
SRC_URI[sha256sum] = "b6e48e97201540b5c61b86afbc9c8f4a1d8e696854b21582ad90798750415bb3"

S = "${WORKDIR}/srfi-102-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
