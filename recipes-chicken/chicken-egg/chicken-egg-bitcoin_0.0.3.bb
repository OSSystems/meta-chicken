SECTION = "devel/chicken"
DESCRIPTION = "bitcoind JSON-RPC API client"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://bitcoin.meta;md5=3984dd86aac405aadfe1275ddf7b75f1"
DEPENDS_append_class-cross = " chicken-egg-medea-cross chicken-egg-uri-common-cross chicken-egg-http-client-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-medea-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-http-client-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-medea nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-http-client chicken-egg-medea-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-http-client-crosssdk"
DEPENDS = " chicken-egg-medea chicken-egg-uri-common chicken-egg-http-client chicken-egg-medea-cross chicken-egg-uri-common-cross chicken-egg-http-client-cross"
RDEPENDS_${PN} = " chicken-egg-medea chicken-egg-uri-common chicken-egg-http-client"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/bitcoin/bitcoin-${PV}.tar.gz"

SRC_URI[md5sum] = "0107c6f5846dcd3afc4d84a7f0ad3c6a"
SRC_URI[sha256sum] = "db8a11c7644d77bfb7e8d77a90d66caca556aca707f0727a7626a576d3eeb0d9"

S = "${WORKDIR}/bitcoin-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
