SECTION = "devel/chicken"
DESCRIPTION = "awful provides an application and an extension to ease the development of web-based applications."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://awful.meta;md5=95221d2e8b1717b78a658d446cdc1eaa"
DEPENDS_virtclass-cross += "chicken-egg-spiffy-cross chicken-egg-spiffy-request-vars-cross chicken-egg-html-tags-cross chicken-egg-html-utils-cross chicken-egg-http-session-cross chicken-egg-json-cross chicken-egg-spiffy-cookies-cross chicken-egg-regex-cross chicken-egg-sxml-transforms-cross"
DEPENDS += "chicken-egg-spiffy chicken-egg-spiffy-request-vars chicken-egg-html-tags chicken-egg-html-utils chicken-egg-http-session chicken-egg-json chicken-egg-spiffy-cookies chicken-egg-regex chicken-egg-sxml-transforms chicken-egg-spiffy-cross chicken-egg-spiffy-request-vars-cross chicken-egg-html-tags-cross chicken-egg-html-utils-cross chicken-egg-http-session-cross chicken-egg-json-cross chicken-egg-spiffy-cookies-cross chicken-egg-regex-cross chicken-egg-sxml-transforms-cross chicken-egg-awful-cross"
RDEPENDS_${PN} += "chicken-egg-spiffy chicken-egg-spiffy-request-vars chicken-egg-html-tags chicken-egg-html-utils chicken-egg-http-session chicken-egg-json chicken-egg-spiffy-cookies chicken-egg-regex chicken-egg-sxml-transforms"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "a043bd9628d2497166356dd0e26a7c1f"
SRC_URI[sha256sum] = "6c0fd14391976d049b230e74eaa579b9d62b049f6ddbcb20192e7c22a0b91633"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
