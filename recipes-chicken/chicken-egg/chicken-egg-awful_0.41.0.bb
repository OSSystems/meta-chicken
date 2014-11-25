SECTION = "devel/chicken"
DESCRIPTION = "awful provides an application and an extension to ease the development of web-based applications."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://awful.meta;md5=95221d2e8b1717b78a658d446cdc1eaa"
DEPENDS_append_class-cross = " chicken-egg-spiffy-cross chicken-egg-spiffy-request-vars-cross chicken-egg-html-tags-cross chicken-egg-html-utils-cross chicken-egg-http-session-cross chicken-egg-json-cross chicken-egg-spiffy-cookies-cross chicken-egg-regex-cross chicken-egg-sxml-transforms-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-spiffy-crosssdk chicken-egg-spiffy-request-vars-crosssdk chicken-egg-html-tags-crosssdk chicken-egg-html-utils-crosssdk chicken-egg-http-session-crosssdk chicken-egg-json-crosssdk chicken-egg-spiffy-cookies-crosssdk chicken-egg-regex-crosssdk chicken-egg-sxml-transforms-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-spiffy nativesdk-chicken-egg-spiffy-request-vars nativesdk-chicken-egg-html-tags nativesdk-chicken-egg-html-utils nativesdk-chicken-egg-http-session nativesdk-chicken-egg-json nativesdk-chicken-egg-spiffy-cookies nativesdk-chicken-egg-regex nativesdk-chicken-egg-sxml-transforms chicken-egg-spiffy-crosssdk chicken-egg-spiffy-request-vars-crosssdk chicken-egg-html-tags-crosssdk chicken-egg-html-utils-crosssdk chicken-egg-http-session-crosssdk chicken-egg-json-crosssdk chicken-egg-spiffy-cookies-crosssdk chicken-egg-regex-crosssdk chicken-egg-sxml-transforms-crosssdk"
DEPENDS = " chicken-egg-spiffy chicken-egg-spiffy-request-vars chicken-egg-html-tags chicken-egg-html-utils chicken-egg-http-session chicken-egg-json chicken-egg-spiffy-cookies chicken-egg-regex chicken-egg-sxml-transforms chicken-egg-spiffy-cross chicken-egg-spiffy-request-vars-cross chicken-egg-html-tags-cross chicken-egg-html-utils-cross chicken-egg-http-session-cross chicken-egg-json-cross chicken-egg-spiffy-cookies-cross chicken-egg-regex-cross chicken-egg-sxml-transforms-cross chicken-egg-awful-cross"
RDEPENDS_${PN} = " chicken-egg-spiffy chicken-egg-spiffy-request-vars chicken-egg-html-tags chicken-egg-html-utils chicken-egg-http-session chicken-egg-json chicken-egg-spiffy-cookies chicken-egg-regex chicken-egg-sxml-transforms"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "3298742a5113f30b5c6388342791b47a"
SRC_URI[sha256sum] = "b2ec85094c2be9b8e36af4768f363dc34677a2ec9bb8df777fe53a81c1a02e21"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
