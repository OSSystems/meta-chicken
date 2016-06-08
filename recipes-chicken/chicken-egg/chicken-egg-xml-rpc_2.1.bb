SECTION = "devel/chicken"
DESCRIPTION = "XML-RPC client/server"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://xml-rpc.meta;md5=bc0501c4e0b7eaedd8d0d34afbf7835b"
DEPENDS_append_class-cross = " chicken-egg-base64-cross chicken-egg-http-client-cross chicken-egg-intarweb-cross chicken-egg-ssax-cross chicken-egg-sxpath-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-base64-crosssdk chicken-egg-http-client-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-ssax-crosssdk chicken-egg-sxpath-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-base64 nativesdk-chicken-egg-http-client nativesdk-chicken-egg-intarweb nativesdk-chicken-egg-ssax nativesdk-chicken-egg-sxpath chicken-egg-base64-crosssdk chicken-egg-http-client-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-ssax-crosssdk chicken-egg-sxpath-crosssdk"
DEPENDS = " chicken-egg-base64 chicken-egg-http-client chicken-egg-intarweb chicken-egg-ssax chicken-egg-sxpath chicken-egg-base64-cross chicken-egg-http-client-cross chicken-egg-intarweb-cross chicken-egg-ssax-cross chicken-egg-sxpath-cross chicken-egg-xml-rpc-cross"
RDEPENDS_${PN} = " chicken-egg-base64 chicken-egg-http-client chicken-egg-intarweb chicken-egg-ssax chicken-egg-sxpath"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/xml-rpc/xml-rpc-${PV}.tar.gz"

SRC_URI[md5sum] = "1a17a95ae066a28acfee6ca78acb6347"
SRC_URI[sha256sum] = "55e2e070ef99dfbf646645bc41b5b62656b369cd54c807574d11c3bc076b395e"

S = "${WORKDIR}/xml-rpc-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
