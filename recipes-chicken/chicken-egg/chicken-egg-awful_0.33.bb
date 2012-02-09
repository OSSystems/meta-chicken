SECTION = "devel/chicken"
DESCRIPTION = "awful provides an application and an extension to ease the development of web-based applications."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://awful.meta;md5=10100c5fbfeed459684f65625ff87969"
DEPENDS_virtclass-cross += "chicken-egg-spiffy-cross chicken-egg-spiffy-request-vars-cross chicken-egg-html-tags-cross chicken-egg-html-utils-cross chicken-egg-http-session-cross chicken-egg-json-cross chicken-egg-spiffy-cookies-cross chicken-egg-regex-cross"
DEPENDS += "chicken-egg-spiffy chicken-egg-spiffy-request-vars chicken-egg-html-tags chicken-egg-html-utils chicken-egg-http-session chicken-egg-json chicken-egg-spiffy-cookies chicken-egg-regex chicken-egg-spiffy-cross chicken-egg-spiffy-request-vars-cross chicken-egg-html-tags-cross chicken-egg-html-utils-cross chicken-egg-http-session-cross chicken-egg-json-cross chicken-egg-spiffy-cookies-cross chicken-egg-regex-cross chicken-egg-awful-cross"
RDEPENDS += "chicken-egg-spiffy chicken-egg-spiffy-request-vars chicken-egg-html-tags chicken-egg-html-utils chicken-egg-http-session chicken-egg-json chicken-egg-spiffy-cookies chicken-egg-regex"

PR = "r1"

inherit chicken_install

BBCLASSEXTEND = "cross"
