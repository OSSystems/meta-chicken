SECTION = "devel/chicken"
DESCRIPTION = "Integers as bits"
LICENSE = "Artistic"
LIC_FILES_CHKSUM = "file://srfi-60.meta;md5=2c39dcd67551cd571999e261c796361c"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-60/srfi-60-${PV}.tar.gz"

SRC_URI[md5sum] = "829bd1a3d15a0d987cc5d6966b80ae03"
SRC_URI[sha256sum] = "417e18f14dc130305b848d1ea8f35da2d8dbd757dfdc7d8939ce6c48cca0a6cc"

S = "${WORKDIR}/srfi-60-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
