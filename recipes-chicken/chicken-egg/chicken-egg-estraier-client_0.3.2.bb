SECTION = "devel/chicken"
DESCRIPTION = "A pure Scheme Hyper Estraier client library"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://estraier-client.meta;md5=2ddd05db202107e7cb54f06236efa7e7"
DEPENDS_append_class-cross = " chicken-egg-http-client-cross chicken-egg-uri-common-cross chicken-egg-intarweb-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-http-client-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-intarweb-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-http-client nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-intarweb chicken-egg-http-client-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-intarweb-crosssdk"
DEPENDS = " chicken-egg-http-client chicken-egg-uri-common chicken-egg-intarweb chicken-egg-http-client-cross chicken-egg-uri-common-cross chicken-egg-intarweb-cross"
RDEPENDS_${PN} = " chicken-egg-http-client chicken-egg-uri-common chicken-egg-intarweb"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/estraier-client/estraier-client-${PV}.tar.gz"

SRC_URI[md5sum] = "1a5275058b44d54b2e529a83d95e4b19"
SRC_URI[sha256sum] = "703ca9ebeed502c4e463ae0220d9fa241c588bab99c0c178272bd53a933e5f92"

S = "${WORKDIR}/estraier-client-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
