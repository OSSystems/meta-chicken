SECTION = "devel/chicken"
DESCRIPTION = "An interface to James Clark's Expat XML parser"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://expat.meta;md5=477f13301b0f84a39fbb994994d7eee8"
DEPENDS_append_class-cross = " chicken-egg-silex-cross chicken-egg-easyffi-cross expat-native"
DEPENDS_append_class-crosssdk = " chicken-egg-silex-crosssdk chicken-egg-easyffi-crosssdk expat-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-silex nativesdk-chicken-egg-easyffi nativesdk-expat chicken-egg-silex-crosssdk chicken-egg-easyffi-crosssdk"
DEPENDS = " chicken-egg-silex chicken-egg-easyffi expat chicken-egg-silex-cross chicken-egg-easyffi-cross"
RDEPENDS_${PN} = " chicken-egg-silex chicken-egg-easyffi"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/expat/expat-${PV}.tar.gz"

SRC_URI[md5sum] = "987ded73ee7a786b9c21a867f52ccd24"
SRC_URI[sha256sum] = "30583a355de5ffa9dd6b25f4f9d40ee9ecb099f02c98a0be455907e3d9b912f3"

S = "${WORKDIR}/expat-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
