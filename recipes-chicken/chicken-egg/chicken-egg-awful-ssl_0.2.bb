SECTION = "devel/chicken"
DESCRIPTION = "SSL support for awful"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://awful-ssl.meta;md5=3b9b3cb66ac772374accc483dfe155a9"
DEPENDS_virtclass-cross += "chicken-egg-awful-cross chicken-egg-openssl-cross chicken-egg-spiffy-cross"
DEPENDS += "chicken-egg-awful chicken-egg-openssl chicken-egg-spiffy chicken-egg-awful-cross chicken-egg-openssl-cross chicken-egg-spiffy-cross"
RDEPENDS_${PN} += "chicken-egg-awful chicken-egg-openssl chicken-egg-spiffy"

inherit chicken_install

BBCLASSEXTEND = "cross"
