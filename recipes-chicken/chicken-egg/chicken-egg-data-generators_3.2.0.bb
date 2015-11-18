SECTION = "devel/chicken"
DESCRIPTION = "Automatic generation of sample data. Useful for testing or other occasions where you just need a way to quickly generate data"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://data-generators.meta;md5=fd0c95b11fced7db82b3f69880dccc02"
DEPENDS_append_class-cross = " chicken-egg-random-bsd-cross chicken-egg-numbers-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-random-bsd-crosssdk chicken-egg-numbers-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-random-bsd nativesdk-chicken-egg-numbers chicken-egg-random-bsd-crosssdk chicken-egg-numbers-crosssdk"
DEPENDS = " chicken-egg-random-bsd chicken-egg-numbers chicken-egg-random-bsd-cross chicken-egg-numbers-cross chicken-egg-data-generators-cross"
RDEPENDS_${PN} = " chicken-egg-random-bsd chicken-egg-numbers"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/data-generators/data-generators-${PV}.tar.gz"

SRC_URI[md5sum] = "cf85f830b9e4dd411788280aed4cd278"
SRC_URI[sha256sum] = "47d0ea0075d8f5847d9b6af896ebcdd12ad0e94493fb406220ba549666936a66"

S = "${WORKDIR}/data-generators-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
