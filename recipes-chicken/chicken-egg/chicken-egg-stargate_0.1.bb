SECTION = "devel/chicken"
DESCRIPTION = "Provide access to HBase via the Stargate REST API"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://stargate.meta;md5=ab3bdad85f3ddd84e9b346be622e5362"
DEPENDS_append_class-cross = " chicken-egg-rest-bind-cross chicken-egg-http-client-cross chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-medea-cross chicken-egg-base64-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-rest-bind-crosssdk chicken-egg-http-client-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-medea-crosssdk chicken-egg-base64-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-rest-bind nativesdk-chicken-egg-http-client nativesdk-chicken-egg-intarweb nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-medea nativesdk-chicken-egg-base64 chicken-egg-rest-bind-crosssdk chicken-egg-http-client-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-medea-crosssdk chicken-egg-base64-crosssdk"
DEPENDS = " chicken-egg-rest-bind chicken-egg-http-client chicken-egg-intarweb chicken-egg-uri-common chicken-egg-medea chicken-egg-base64 chicken-egg-rest-bind-cross chicken-egg-http-client-cross chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-medea-cross chicken-egg-base64-cross"
RDEPENDS_${PN} = " chicken-egg-rest-bind chicken-egg-http-client chicken-egg-intarweb chicken-egg-uri-common chicken-egg-medea chicken-egg-base64"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/stargate/stargate-${PV}.tar.gz"

SRC_URI[md5sum] = "5241cd8baf81079f42280f829b05d33b"
SRC_URI[sha256sum] = "ea714ccc4d42295a78b86339bb2d45cddaeb7fea9ba405d2ef108e879998b15a"

S = "${WORKDIR}/stargate-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
