inherit chicken_install

SECTION = "devel/chicken"
DESCRIPTION = "SSL support for awful"
DEPENDS_virtclass-cross += "chicken-cross chicken-egg-awful-cross chicken-egg-openssl-cross chicken-egg-spiffy-cross"
DEPENDS += "chicken chicken-egg-awful chicken-egg-openssl chicken-egg-spiffy chicken-egg-awful-cross chicken-egg-openssl-cross chicken-egg-spiffy-cross"
RDEPENDS += "chicken-egg-awful chicken-egg-openssl chicken-egg-spiffy"

BBCLASSEXTEND = "cross"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://awful-ssl.meta;md5=3b9b3cb66ac772374accc483dfe155a9"
