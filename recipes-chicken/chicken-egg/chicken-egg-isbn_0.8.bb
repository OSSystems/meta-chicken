SECTION = "devel/chicken"
DESCRIPTION = "ISBN lib for handling book identifier numbers and public isbn databases"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://isbn.meta;md5=2c82f69744383462dffe6f703e95d05f"
DEPENDS_append_class-cross = " chicken-egg-json-cross chicken-egg-sxml-transforms-cross chicken-egg-sxpath-cross chicken-egg-intarweb-cross chicken-egg-http-client-cross chicken-egg-ssax-cross chicken-egg-uri-common-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-json-crosssdk chicken-egg-sxml-transforms-crosssdk chicken-egg-sxpath-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-http-client-crosssdk chicken-egg-ssax-crosssdk chicken-egg-uri-common-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-json nativesdk-chicken-egg-sxml-transforms nativesdk-chicken-egg-sxpath nativesdk-chicken-egg-intarweb nativesdk-chicken-egg-http-client nativesdk-chicken-egg-ssax nativesdk-chicken-egg-uri-common chicken-egg-json-crosssdk chicken-egg-sxml-transforms-crosssdk chicken-egg-sxpath-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-http-client-crosssdk chicken-egg-ssax-crosssdk chicken-egg-uri-common-crosssdk"
DEPENDS = " chicken-egg-json chicken-egg-sxml-transforms chicken-egg-sxpath chicken-egg-intarweb chicken-egg-http-client chicken-egg-ssax chicken-egg-uri-common chicken-egg-json-cross chicken-egg-sxml-transforms-cross chicken-egg-sxpath-cross chicken-egg-intarweb-cross chicken-egg-http-client-cross chicken-egg-ssax-cross chicken-egg-uri-common-cross"
RDEPENDS_${PN} = " chicken-egg-json chicken-egg-sxml-transforms chicken-egg-sxpath chicken-egg-intarweb chicken-egg-http-client chicken-egg-ssax chicken-egg-uri-common"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/isbn/isbn-${PV}.tar.gz"

SRC_URI[md5sum] = "abd791f57fedf64234c44f4286d6c8fb"
SRC_URI[sha256sum] = "61cd1401ee948473cde60ab4221ac4101f276e3c213c87d6842405fef31b7aa0"

S = "${WORKDIR}/isbn-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
