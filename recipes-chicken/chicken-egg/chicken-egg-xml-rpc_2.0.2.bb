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

SRC_URI[md5sum] = "477f9bcf5c82f45030514dc9d29c2c6a"
SRC_URI[sha256sum] = "b2581c1b922f388b527596519663621b678f4758db59e0cd93fa054d6a890c56"

S = "${WORKDIR}/xml-rpc-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
