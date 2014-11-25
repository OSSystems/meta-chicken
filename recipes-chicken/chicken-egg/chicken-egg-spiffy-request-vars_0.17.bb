SECTION = "devel/chicken"
DESCRIPTION = "Provides easy access to variables from HTTP requests"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://spiffy-request-vars.meta;md5=9747afe9c0c21c02d9729c0d04c7c8a8"
DEPENDS_append_class-cross = " chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-spiffy-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-intarweb-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-spiffy-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-intarweb nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-spiffy chicken-egg-intarweb-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-spiffy-crosssdk"
DEPENDS = " chicken-egg-intarweb chicken-egg-uri-common chicken-egg-spiffy chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-spiffy-cross"
RDEPENDS_${PN} = " chicken-egg-intarweb chicken-egg-uri-common chicken-egg-spiffy"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "28ec155dd271d44bc594a7c0c92afdd1"
SRC_URI[sha256sum] = "d2ba8d5fc07dc896999f1a43bf0fe5129555a19c97e14b44445d368c6eb5defc"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
