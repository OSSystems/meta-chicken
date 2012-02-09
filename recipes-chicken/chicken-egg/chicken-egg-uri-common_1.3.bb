SECTION = "devel/chicken"
DESCRIPTION = "Parser for common URI schemes"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://uri-common.meta;md5=3a68c19704242347487cce53495c1dc8"
DEPENDS_virtclass-cross += "chicken-egg-uri-generic-cross chicken-egg-defstruct-cross chicken-egg-matchable-cross"
DEPENDS += "chicken-egg-uri-generic chicken-egg-defstruct chicken-egg-matchable chicken-egg-uri-generic-cross chicken-egg-defstruct-cross chicken-egg-matchable-cross"
RDEPENDS += "chicken-egg-uri-generic chicken-egg-defstruct chicken-egg-matchable"

inherit chicken_install

BBCLASSEXTEND = "cross"
