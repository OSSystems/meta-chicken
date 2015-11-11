SECTION = "devel/chicken"
DESCRIPTION = "awful provides an application and an extension to ease the development of web-based applications."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://awful.meta;md5=910e4a443ed5a26488edf8b6ae15434d"
DEPENDS_append_class-cross = " chicken-egg-json-cross chicken-egg-html-tags-cross chicken-egg-html-utils-cross chicken-egg-http-session-cross chicken-egg-regex-cross chicken-egg-spiffy-cross chicken-egg-spiffy-cookies-cross chicken-egg-spiffy-request-vars-cross chicken-egg-sxml-transforms-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-json-crosssdk chicken-egg-html-tags-crosssdk chicken-egg-html-utils-crosssdk chicken-egg-http-session-crosssdk chicken-egg-regex-crosssdk chicken-egg-spiffy-crosssdk chicken-egg-spiffy-cookies-crosssdk chicken-egg-spiffy-request-vars-crosssdk chicken-egg-sxml-transforms-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-json nativesdk-chicken-egg-html-tags nativesdk-chicken-egg-html-utils nativesdk-chicken-egg-http-session nativesdk-chicken-egg-regex nativesdk-chicken-egg-spiffy nativesdk-chicken-egg-spiffy-cookies nativesdk-chicken-egg-spiffy-request-vars nativesdk-chicken-egg-sxml-transforms chicken-egg-json-crosssdk chicken-egg-html-tags-crosssdk chicken-egg-html-utils-crosssdk chicken-egg-http-session-crosssdk chicken-egg-regex-crosssdk chicken-egg-spiffy-crosssdk chicken-egg-spiffy-cookies-crosssdk chicken-egg-spiffy-request-vars-crosssdk chicken-egg-sxml-transforms-crosssdk"
DEPENDS = " chicken-egg-json chicken-egg-html-tags chicken-egg-html-utils chicken-egg-http-session chicken-egg-regex chicken-egg-spiffy chicken-egg-spiffy-cookies chicken-egg-spiffy-request-vars chicken-egg-sxml-transforms chicken-egg-json-cross chicken-egg-html-tags-cross chicken-egg-html-utils-cross chicken-egg-http-session-cross chicken-egg-regex-cross chicken-egg-spiffy-cross chicken-egg-spiffy-cookies-cross chicken-egg-spiffy-request-vars-cross chicken-egg-sxml-transforms-cross chicken-egg-awful-cross"
RDEPENDS_${PN} = " chicken-egg-json chicken-egg-html-tags chicken-egg-html-utils chicken-egg-http-session chicken-egg-regex chicken-egg-spiffy chicken-egg-spiffy-cookies chicken-egg-spiffy-request-vars chicken-egg-sxml-transforms"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/awful/awful-${PV}.tar.gz"

SRC_URI[md5sum] = "9c75466c14198f52df2eb6fec59d2151"
SRC_URI[sha256sum] = "88b1f49de44d8abf26a288ad6d66141e62c0f023a79ed1a2d32f6f16bdc971b6"

S = "${WORKDIR}/awful-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
