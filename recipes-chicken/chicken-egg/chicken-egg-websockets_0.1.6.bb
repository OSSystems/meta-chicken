SECTION = "devel/chicken"
DESCRIPTION = "websockets provides a websocket API."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://websockets.meta;md5=e4b906ec04b16bc414e6f58462abee9c"
DEPENDS_append_class-cross = " chicken-egg-spiffy-cross chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-base64-cross chicken-egg-simple-sha1-cross chicken-egg-mailbox-cross chicken-egg-comparse-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-spiffy-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-base64-crosssdk chicken-egg-simple-sha1-crosssdk chicken-egg-mailbox-crosssdk chicken-egg-comparse-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-spiffy nativesdk-chicken-egg-intarweb nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-base64 nativesdk-chicken-egg-simple-sha1 nativesdk-chicken-egg-mailbox nativesdk-chicken-egg-comparse chicken-egg-spiffy-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-base64-crosssdk chicken-egg-simple-sha1-crosssdk chicken-egg-mailbox-crosssdk chicken-egg-comparse-crosssdk"
DEPENDS = " chicken-egg-spiffy chicken-egg-intarweb chicken-egg-uri-common chicken-egg-base64 chicken-egg-simple-sha1 chicken-egg-mailbox chicken-egg-comparse chicken-egg-spiffy-cross chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-base64-cross chicken-egg-simple-sha1-cross chicken-egg-mailbox-cross chicken-egg-comparse-cross"
RDEPENDS_${PN} = " chicken-egg-spiffy chicken-egg-intarweb chicken-egg-uri-common chicken-egg-base64 chicken-egg-simple-sha1 chicken-egg-mailbox chicken-egg-comparse"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/websockets/websockets-${PV}.tar.gz"

SRC_URI[md5sum] = "8141541b0426694f8139cc0c0af8d4a4"
SRC_URI[sha256sum] = "b696fbc83487b93bc8e629cc8541c1f5a1daefb5d62551eed2ac98194af402bc"

S = "${WORKDIR}/websockets-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
