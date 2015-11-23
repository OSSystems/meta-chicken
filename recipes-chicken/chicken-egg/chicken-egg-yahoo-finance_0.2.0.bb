SECTION = "devel/chicken"
DESCRIPTION = "Retrieve stock quotes from Yahoo! Finance"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://yahoo-finance.meta;md5=4dfd83bc9e92968310be6a40f263e70f"
DEPENDS_append_class-cross = " chicken-egg-csv-xml-cross chicken-egg-uri-common-cross chicken-egg-intarweb-cross chicken-egg-http-client-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-csv-xml-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-http-client-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-csv-xml nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-intarweb nativesdk-chicken-egg-http-client chicken-egg-csv-xml-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-http-client-crosssdk"
DEPENDS = " chicken-egg-csv-xml chicken-egg-uri-common chicken-egg-intarweb chicken-egg-http-client chicken-egg-csv-xml-cross chicken-egg-uri-common-cross chicken-egg-intarweb-cross chicken-egg-http-client-cross"
RDEPENDS_${PN} = " chicken-egg-csv-xml chicken-egg-uri-common chicken-egg-intarweb chicken-egg-http-client"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/yahoo-finance/yahoo-finance-${PV}.tar.gz"

SRC_URI[md5sum] = "cb10b91f2caf4804144ab5922a230d53"
SRC_URI[sha256sum] = "cecea7b4dda5b9a3e8de450c0f02245f9492e8ea1e9c680b95fc4ff5fb0c6d7b"

S = "${WORKDIR}/yahoo-finance-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
