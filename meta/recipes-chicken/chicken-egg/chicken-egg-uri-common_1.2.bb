inherit chicken_install

SECTION = "devel/chicken"
DESCRIPTION = "Parser for common URI schemes"
DEPENDS_virtclass-cross += "chicken-cross chicken-egg-uri-generic-cross chicken-egg-defstruct-cross chicken-egg-matchable-cross"
DEPENDS += "chicken chicken-egg-uri-generic chicken-egg-defstruct chicken-egg-matchable chicken-egg-uri-generic-cross chicken-egg-defstruct-cross chicken-egg-matchable-cross"
RDEPENDS += "chicken-egg-uri-generic chicken-egg-defstruct chicken-egg-matchable"

BBCLASSEXTEND = "cross"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://uri-common.meta;md5=924c2fcdea6cdaf4cb0f91f38a7ef1a1"
