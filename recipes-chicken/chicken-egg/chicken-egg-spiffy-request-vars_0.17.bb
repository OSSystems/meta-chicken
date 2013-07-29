SECTION = "devel/chicken"
DESCRIPTION = "Provides easy access to variables from HTTP requests"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://spiffy-request-vars.meta;md5=9747afe9c0c21c02d9729c0d04c7c8a8"
DEPENDS_virtclass-cross += "chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-spiffy-cross"
DEPENDS += "chicken-egg-intarweb chicken-egg-uri-common chicken-egg-spiffy chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-spiffy-cross"
RDEPENDS_${PN} += "chicken-egg-intarweb chicken-egg-uri-common chicken-egg-spiffy"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "28ec155dd271d44bc594a7c0c92afdd1"
SRC_URI[sha256sum] = "d2ba8d5fc07dc896999f1a43bf0fe5129555a19c97e14b44445d368c6eb5defc"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
