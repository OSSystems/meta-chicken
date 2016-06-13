SECTION = "devel/chicken"
DESCRIPTION = "Integers as bits"
LICENSE = "Artistic-1.0"
LIC_FILES_CHKSUM = "file://srfi-60.meta;md5=2c39dcd67551cd571999e261c796361c"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-60/srfi-60-${PV}.tar.gz"

SRC_URI[md5sum] = "b8a6a2361f9f91686b2c7a825a82e4ea"
SRC_URI[sha256sum] = "9d2e0c04409b5a5f30426d8454912f727475de266b502243415f816bbb289064"

S = "${WORKDIR}/srfi-60-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
