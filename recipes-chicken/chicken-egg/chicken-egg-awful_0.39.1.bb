SECTION = "devel/chicken"
DESCRIPTION = "awful provides an application and an extension to ease the development of web-based applications."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://awful.meta;md5=95221d2e8b1717b78a658d446cdc1eaa"
DEPENDS_virtclass-cross += "chicken-egg-spiffy-cross chicken-egg-spiffy-request-vars-cross chicken-egg-html-tags-cross chicken-egg-html-utils-cross chicken-egg-http-session-cross chicken-egg-json-cross chicken-egg-spiffy-cookies-cross chicken-egg-regex-cross chicken-egg-sxml-transforms-cross"
DEPENDS += "chicken-egg-spiffy chicken-egg-spiffy-request-vars chicken-egg-html-tags chicken-egg-html-utils chicken-egg-http-session chicken-egg-json chicken-egg-spiffy-cookies chicken-egg-regex chicken-egg-sxml-transforms chicken-egg-spiffy-cross chicken-egg-spiffy-request-vars-cross chicken-egg-html-tags-cross chicken-egg-html-utils-cross chicken-egg-http-session-cross chicken-egg-json-cross chicken-egg-spiffy-cookies-cross chicken-egg-regex-cross chicken-egg-sxml-transforms-cross chicken-egg-awful-cross"
RDEPENDS_${PN} += "chicken-egg-spiffy chicken-egg-spiffy-request-vars chicken-egg-html-tags chicken-egg-html-utils chicken-egg-http-session chicken-egg-json chicken-egg-spiffy-cookies chicken-egg-regex chicken-egg-sxml-transforms"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "750b6c8a5158269992f9d8d4cfaa2f1e"
SRC_URI[sha256sum] = "2a752f15693ccc620f5a2dbd1f8c4b8bd6ee55e9b2d6969b5e3bf25ca7f82b1a"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
