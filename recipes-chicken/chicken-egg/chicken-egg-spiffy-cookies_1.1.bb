SECTION = "devel/chicken"
DESCRIPTION = "Procedures for managing cookies"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://spiffy-cookies.meta;md5=ed39681648eee590cbc51b8ade0ac773"
DEPENDS_virtclass-cross += "chicken-egg-spiffy-cross chicken-egg-intarweb-cross"
DEPENDS += "chicken-egg-spiffy chicken-egg-intarweb chicken-egg-spiffy-cross chicken-egg-intarweb-cross"
RDEPENDS_${PN} += "chicken-egg-spiffy chicken-egg-intarweb"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "39e6bd304edc1163cd2dc374ee0bec38"
SRC_URI[sha256sum] = "b4fd9a7ebe917b7f433d874c0abebfcf2abafec081b69d10c693936b81aeb94d"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
