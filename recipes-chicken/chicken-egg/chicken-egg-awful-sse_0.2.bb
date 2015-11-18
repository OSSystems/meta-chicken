SECTION = "devel/chicken"
DESCRIPTION = "Server-Sent Events module for Awful"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://awful-sse.meta;md5=2e317f7cb499adb4551cdb4707753f6a"
DEPENDS_append_class-cross = " chicken-egg-awful-cross chicken-egg-spiffy-cross chicken-egg-intarweb-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-awful-crosssdk chicken-egg-spiffy-crosssdk chicken-egg-intarweb-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-awful nativesdk-chicken-egg-spiffy nativesdk-chicken-egg-intarweb chicken-egg-awful-crosssdk chicken-egg-spiffy-crosssdk chicken-egg-intarweb-crosssdk"
DEPENDS = " chicken-egg-awful chicken-egg-spiffy chicken-egg-intarweb chicken-egg-awful-cross chicken-egg-spiffy-cross chicken-egg-intarweb-cross"
RDEPENDS_${PN} = " chicken-egg-awful chicken-egg-spiffy chicken-egg-intarweb"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/awful-sse/awful-sse-${PV}.tar.gz"

SRC_URI[md5sum] = "efe6d135318a1843e2a029fbe9aea1ff"
SRC_URI[sha256sum] = "1efa40fcf8d77a6bd112a57f76085116d9ea8d50e3c5bd3d4a18bc0c451b1aa3"

S = "${WORKDIR}/awful-sse-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
