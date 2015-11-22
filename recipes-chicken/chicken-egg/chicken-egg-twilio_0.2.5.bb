SECTION = "devel/chicken"
DESCRIPTION = "Bindings to the Twilio API"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://twilio.meta;md5=313efa0a6ddb1308d39c83b90c7b6258"
DEPENDS_append_class-cross = " chicken-egg-hahn-cross chicken-egg-htmlprag-cross chicken-egg-http-client-cross chicken-egg-matchable-cross chicken-egg-s-cross chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-hahn-crosssdk chicken-egg-htmlprag-crosssdk chicken-egg-http-client-crosssdk chicken-egg-matchable-crosssdk chicken-egg-s-crosssdk chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-hahn nativesdk-chicken-egg-htmlprag nativesdk-chicken-egg-http-client nativesdk-chicken-egg-matchable nativesdk-chicken-egg-s nativesdk-chicken-egg-setup-helper chicken-egg-hahn-crosssdk chicken-egg-htmlprag-crosssdk chicken-egg-http-client-crosssdk chicken-egg-matchable-crosssdk chicken-egg-s-crosssdk chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-hahn chicken-egg-htmlprag chicken-egg-http-client chicken-egg-matchable chicken-egg-s chicken-egg-setup-helper chicken-egg-hahn-cross chicken-egg-htmlprag-cross chicken-egg-http-client-cross chicken-egg-matchable-cross chicken-egg-s-cross chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-hahn chicken-egg-htmlprag chicken-egg-http-client chicken-egg-matchable chicken-egg-s chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/twilio/twilio-${PV}.tar.gz"

SRC_URI[md5sum] = "b1f9cf078a28ddb51643257bedb35681"
SRC_URI[sha256sum] = "5bda4c9dee4ec72042da6dbeaf6648798ab17d7ebc2613e10228cf1e642387af"

S = "${WORKDIR}/twilio-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
