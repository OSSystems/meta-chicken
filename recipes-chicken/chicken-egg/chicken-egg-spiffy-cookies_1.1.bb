SECTION = "devel/chicken"
DESCRIPTION = "Procedures for managing cookies"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://spiffy-cookies.meta;md5=ed39681648eee590cbc51b8ade0ac773"
DEPENDS_virtclass-cross += "chicken-egg-spiffy-cross chicken-egg-intarweb-cross"
DEPENDS += "chicken-egg-spiffy chicken-egg-intarweb chicken-egg-spiffy-cross chicken-egg-intarweb-cross"
RDEPENDS_${PN} += "chicken-egg-spiffy chicken-egg-intarweb"

inherit chicken_install

BBCLASSEXTEND = "cross"
