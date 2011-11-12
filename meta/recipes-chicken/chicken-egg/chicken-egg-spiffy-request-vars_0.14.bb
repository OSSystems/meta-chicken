inherit chicken_install

SECTION = "devel/chicken"
DESCRIPTION = "Provides easy access to variables from HTTP requests"
DEPENDS_virtclass-cross += "chicken-cross chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-spiffy-cross"
DEPENDS += "chicken chicken-egg-intarweb chicken-egg-uri-common chicken-egg-spiffy chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-spiffy-cross"
RDEPENDS += "chicken-egg-intarweb chicken-egg-uri-common chicken-egg-spiffy"

BBCLASSEXTEND = "cross"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://spiffy-request-vars.meta;md5=99306dbd57fc1a79ba871bbdad01c01d"
