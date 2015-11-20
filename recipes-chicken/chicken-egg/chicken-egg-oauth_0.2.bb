SECTION = "devel/chicken"
DESCRIPTION = "OAuth 1.0, 1.0a, RFC 5849"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://oauth.meta;md5=da2565a3d8d766c864d764dd2e172494"
DEPENDS_append_class-cross = " chicken-egg-uri-common-cross chicken-egg-intarweb-cross chicken-egg-http-client-cross chicken-egg-hmac-cross chicken-egg-sha1-cross chicken-egg-base64-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-uri-common-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-http-client-crosssdk chicken-egg-hmac-crosssdk chicken-egg-sha1-crosssdk chicken-egg-base64-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-intarweb nativesdk-chicken-egg-http-client nativesdk-chicken-egg-hmac nativesdk-chicken-egg-sha1 nativesdk-chicken-egg-base64 chicken-egg-uri-common-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-http-client-crosssdk chicken-egg-hmac-crosssdk chicken-egg-sha1-crosssdk chicken-egg-base64-crosssdk"
DEPENDS = " chicken-egg-uri-common chicken-egg-intarweb chicken-egg-http-client chicken-egg-hmac chicken-egg-sha1 chicken-egg-base64 chicken-egg-uri-common-cross chicken-egg-intarweb-cross chicken-egg-http-client-cross chicken-egg-hmac-cross chicken-egg-sha1-cross chicken-egg-base64-cross"
RDEPENDS_${PN} = " chicken-egg-uri-common chicken-egg-intarweb chicken-egg-http-client chicken-egg-hmac chicken-egg-sha1 chicken-egg-base64"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/oauth/oauth-${PV}.tar.gz"

SRC_URI[md5sum] = "1b3ef6f58d50b721935ba02977095c73"
SRC_URI[sha256sum] = "e6b18066aa166cfbd3ebff5c0871827eef19d4340d051b6066dd8b06bbb46b9a"

S = "${WORKDIR}/oauth-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
