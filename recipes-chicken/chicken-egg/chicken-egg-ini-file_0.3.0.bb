SECTION = "devel/chicken"
DESCRIPTION = "Read & write INI configuration files"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://ini-file.meta;md5=83234ecc91328b5adcb0dc8dc607c1e8"
DEPENDS_virtclass-cross += "chicken-egg-regex-cross"
DEPENDS += "chicken-egg-regex chicken-egg-regex-cross"
RDEPENDS_${PN} += "chicken-egg-regex"

inherit chicken_install

BBCLASSEXTEND = "cross"
