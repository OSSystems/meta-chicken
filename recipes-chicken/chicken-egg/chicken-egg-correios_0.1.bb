SECTION = "devel/chicken"
DESCRIPTION = "Correios post office shipping calculation library"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://correios.meta;md5=a515ee45d02da2697b8aa01d1af76f74"
DEPENDS_append_class-cross = " chicken-egg-defstruct-cross chicken-egg-http-client-cross chicken-egg-uri-common-cross chicken-egg-ssax-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-defstruct-crosssdk chicken-egg-http-client-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-ssax-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-defstruct nativesdk-chicken-egg-http-client nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-ssax chicken-egg-defstruct-crosssdk chicken-egg-http-client-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-ssax-crosssdk"
DEPENDS = " chicken-egg-defstruct chicken-egg-http-client chicken-egg-uri-common chicken-egg-ssax chicken-egg-defstruct-cross chicken-egg-http-client-cross chicken-egg-uri-common-cross chicken-egg-ssax-cross"
RDEPENDS_${PN} = " chicken-egg-defstruct chicken-egg-http-client chicken-egg-uri-common chicken-egg-ssax"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/correios/correios-${PV}.tar.gz"

SRC_URI[md5sum] = "b2dceca32d3f08556f59477635a9f829"
SRC_URI[sha256sum] = "822e8f0d93edf8070c1092d9fbd2c65192e63da10c79aac5ecd848a54f472619"

S = "${WORKDIR}/correios-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
