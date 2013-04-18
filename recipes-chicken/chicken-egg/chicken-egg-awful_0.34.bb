SECTION = "devel/chicken"
DESCRIPTION = "awful provides an application and an extension to ease the development of web-based applications."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://awful.meta;md5=10100c5fbfeed459684f65625ff87969"
DEPENDS_virtclass-cross += "chicken-egg-spiffy-cross chicken-egg-spiffy-request-vars-cross chicken-egg-html-tags-cross chicken-egg-html-utils-cross chicken-egg-http-session-cross chicken-egg-json-cross chicken-egg-spiffy-cookies-cross chicken-egg-regex-cross"
DEPENDS += "chicken-egg-spiffy chicken-egg-spiffy-request-vars chicken-egg-html-tags chicken-egg-html-utils chicken-egg-http-session chicken-egg-json chicken-egg-spiffy-cookies chicken-egg-regex chicken-egg-spiffy-cross chicken-egg-spiffy-request-vars-cross chicken-egg-html-tags-cross chicken-egg-html-utils-cross chicken-egg-http-session-cross chicken-egg-json-cross chicken-egg-spiffy-cookies-cross chicken-egg-regex-cross chicken-egg-awful-cross"
RDEPENDS_${PN} += "chicken-egg-spiffy chicken-egg-spiffy-request-vars chicken-egg-html-tags chicken-egg-html-utils chicken-egg-http-session chicken-egg-json chicken-egg-spiffy-cookies chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "aeb03974c61cac965d1b1f32af555a3b"
SRC_URI[sha256sum] = "8de80cbe7c7e309bcc6987b99714862575f0a74097ea4df7215ab392d0d53401"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
