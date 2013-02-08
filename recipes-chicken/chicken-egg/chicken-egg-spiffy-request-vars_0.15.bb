SECTION = "devel/chicken"
DESCRIPTION = "Provides easy access to variables from HTTP requests"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://spiffy-request-vars.meta;md5=99306dbd57fc1a79ba871bbdad01c01d"
DEPENDS_virtclass-cross += "chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-spiffy-cross"
DEPENDS += "chicken-egg-intarweb chicken-egg-uri-common chicken-egg-spiffy chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-spiffy-cross"
RDEPENDS_${PN} += "chicken-egg-intarweb chicken-egg-uri-common chicken-egg-spiffy"

inherit chicken_install

BBCLASSEXTEND = "cross"
