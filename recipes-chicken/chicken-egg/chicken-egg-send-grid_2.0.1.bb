SECTION = "devel/chicken"
DESCRIPTION = "Provides a simple interface to the SendGrid mailer service."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://send-grid.meta;md5=4572977752e30e1323977fbacd0178ac"
DEPENDS_append_class-cross = " chicken-egg-http-client-cross chicken-egg-uri-common-cross chicken-egg-intarweb-cross chicken-egg-json-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-http-client-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-json-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-http-client nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-intarweb nativesdk-chicken-egg-json chicken-egg-http-client-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-json-crosssdk"
DEPENDS = " chicken-egg-http-client chicken-egg-uri-common chicken-egg-intarweb chicken-egg-json chicken-egg-http-client-cross chicken-egg-uri-common-cross chicken-egg-intarweb-cross chicken-egg-json-cross"
RDEPENDS_${PN} = " chicken-egg-http-client chicken-egg-uri-common chicken-egg-intarweb chicken-egg-json"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/send-grid/send-grid-${PV}.tar.gz"

SRC_URI[md5sum] = "35f04e4667ad09787439ee374bfe0e74"
SRC_URI[sha256sum] = "85636fddcb8cde69cb9eff9a9c8061dc353dd6e89e68690a55d37ea87606fc8a"

S = "${WORKDIR}/send-grid-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
