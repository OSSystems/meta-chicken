SECTION = "devel/chicken"
DESCRIPTION = "A utility belt for managing your Chicken coop"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://chicken-belt.meta;md5=9c5b1fc65e8906daac6cf540596e40f7"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/chicken-belt/chicken-belt-${PV}.tar.gz"

SRC_URI[md5sum] = "2a4d75efcbc698e237710131ade41243"
SRC_URI[sha256sum] = "c841610fe408380ba2cffeed10a9e7f0f04bd7b53fc3774440fec38e5de0e05d"

S = "${WORKDIR}/chicken-belt-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
