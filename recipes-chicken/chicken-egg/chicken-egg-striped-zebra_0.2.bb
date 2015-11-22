SECTION = "devel/chicken"
DESCRIPTION = "An API for using the Stripe payment system."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://striped-zebra.meta;md5=7e7948f690cc4788c06c4e2b2ff4a18e"
DEPENDS_append_class-cross = " chicken-egg-http-client-cross chicken-egg-uri-common-cross chicken-egg-intarweb-cross chicken-egg-json-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-http-client-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-json-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-http-client nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-intarweb nativesdk-chicken-egg-json chicken-egg-http-client-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-json-crosssdk"
DEPENDS = " chicken-egg-http-client chicken-egg-uri-common chicken-egg-intarweb chicken-egg-json chicken-egg-http-client-cross chicken-egg-uri-common-cross chicken-egg-intarweb-cross chicken-egg-json-cross"
RDEPENDS_${PN} = " chicken-egg-http-client chicken-egg-uri-common chicken-egg-intarweb chicken-egg-json"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/striped-zebra/striped-zebra-${PV}.tar.gz"

SRC_URI[md5sum] = "3957a7a6c29fab4223a54d5c95e41797"
SRC_URI[sha256sum] = "dbd9f0fa1aa9747c54e72fe10fb0a35d2f76a2e49cdbb54e8af9c417e03d8b10"

S = "${WORKDIR}/striped-zebra-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
