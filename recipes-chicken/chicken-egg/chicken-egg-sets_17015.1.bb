SECTION = "devel/chicken"
DESCRIPTION = "Functions useful for working with sets"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://sets.meta;md5=cf133b67fd4742bbd3b94924b0d07ab1"
DEPENDS_append_class-cross = " chicken-egg-embedded-test-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-embedded-test-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-embedded-test chicken-egg-embedded-test-crosssdk"
DEPENDS = " chicken-egg-embedded-test chicken-egg-embedded-test-cross"
RDEPENDS_${PN} = " chicken-egg-embedded-test"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sets/sets-${PV}.tar.gz"

SRC_URI[md5sum] = "f6950d75d058f91c370ed47ceb967371"
SRC_URI[sha256sum] = "85b9e8df7164253caa9b867be2ebaf43ed35f67511ce6e90c751f2661d0127a9"

S = "${WORKDIR}/sets-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
