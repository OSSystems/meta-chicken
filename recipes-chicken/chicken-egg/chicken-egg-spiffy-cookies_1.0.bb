inherit chicken_install

SECTION = "devel/chicken"
DESCRIPTION = "Procedures for managing cookies"
DEPENDS_virtclass-cross += "chicken-cross chicken-egg-spiffy-cross chicken-egg-intarweb-cross"
DEPENDS += "chicken chicken-egg-spiffy chicken-egg-intarweb chicken-egg-spiffy-cross chicken-egg-intarweb-cross"
RDEPENDS += "chicken-egg-spiffy chicken-egg-intarweb"

BBCLASSEXTEND = "cross"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://spiffy-cookies.meta;md5=d7d3c95f9633a75b2fbf95b8d59409ea"
