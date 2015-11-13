SECTION = "devel/chicken"
DESCRIPTION = "Look up host, protocol, and service information"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://hostinfo.meta;md5=67086ab68b3c3f5205f025f63f4a094e"
DEPENDS_append_class-cross = " chicken-egg-vector-lib-cross chicken-egg-foreigners-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-vector-lib-crosssdk chicken-egg-foreigners-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-vector-lib nativesdk-chicken-egg-foreigners chicken-egg-vector-lib-crosssdk chicken-egg-foreigners-crosssdk"
DEPENDS = " chicken-egg-vector-lib chicken-egg-foreigners chicken-egg-vector-lib-cross chicken-egg-foreigners-cross"
RDEPENDS_${PN} = " chicken-egg-vector-lib chicken-egg-foreigners"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/hostinfo/hostinfo-${PV}.tar.gz"

SRC_URI[md5sum] = "95865f53febe354d41f94746fdf401f0"
SRC_URI[sha256sum] = "4dc8a22dfa57de5c2c21bf56a192bc654046db6767aa67988e569894d3caaa05"

S = "${WORKDIR}/hostinfo-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
