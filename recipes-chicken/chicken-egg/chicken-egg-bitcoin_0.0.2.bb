SECTION = "devel/chicken"
DESCRIPTION = "bitcoind JSON-RPC API client"
LICENSE = "WTFPL"
LIC_FILES_CHKSUM = "file://bitcoin.meta;md5=4a77a6881d2a75b4477155edca92de34"
DEPENDS_append_class-cross = " chicken-egg-medea-cross chicken-egg-uri-common-cross chicken-egg-http-client-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-medea-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-http-client-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-medea nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-http-client chicken-egg-medea-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-http-client-crosssdk"
DEPENDS = " chicken-egg-medea chicken-egg-uri-common chicken-egg-http-client chicken-egg-medea-cross chicken-egg-uri-common-cross chicken-egg-http-client-cross"
RDEPENDS_${PN} = " chicken-egg-medea chicken-egg-uri-common chicken-egg-http-client"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/bitcoin/bitcoin-${PV}.tar.gz"

SRC_URI[md5sum] = "d37ca33b940627a7fa3244fa6206d99a"
SRC_URI[sha256sum] = "802451de29688c62c328a74584f3fd5d1f9f5b9bfe685a2e9f38047b14effe79"

S = "${WORKDIR}/bitcoin-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
