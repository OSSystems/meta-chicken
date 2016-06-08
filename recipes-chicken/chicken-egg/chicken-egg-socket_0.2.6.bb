SECTION = "devel/chicken"
DESCRIPTION = "Interface to the BSD socket API"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://socket.meta;md5=469c72ca2103d4df3e886d6434698a4e"
DEPENDS_append_class-cross = " chicken-egg-foreigners-cross chicken-egg-feature-test-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-foreigners-crosssdk chicken-egg-feature-test-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-foreigners nativesdk-chicken-egg-feature-test chicken-egg-foreigners-crosssdk chicken-egg-feature-test-crosssdk"
DEPENDS = " chicken-egg-foreigners chicken-egg-feature-test chicken-egg-foreigners-cross chicken-egg-feature-test-cross"
RDEPENDS_${PN} = " chicken-egg-foreigners chicken-egg-feature-test"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/socket/socket-${PV}.tar.gz"

SRC_URI[md5sum] = "ca120b2b4c02ea2df043a899c7a4a4ef"
SRC_URI[sha256sum] = "daee86cbf1fb491745bd3f7829dc1e751c584737ca0b2b77aa11a6c0013f5f5e"

S = "${WORKDIR}/socket-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
