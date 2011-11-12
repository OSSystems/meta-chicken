inherit chicken_install

SECTION = "devel/chicken"
DESCRIPTION = "URI generic syntax (RFC 3986) parsing and manipulation."
DEPENDS_virtclass-cross += "chicken-cross chicken-egg-matchable-cross chicken-egg-defstruct-cross"
DEPENDS += "chicken chicken-egg-matchable chicken-egg-defstruct chicken-egg-matchable-cross chicken-egg-defstruct-cross"
RDEPENDS += "chicken-egg-matchable chicken-egg-defstruct"

BBCLASSEXTEND = "cross"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://uri-generic.meta;md5=1b38ce87b80c8a88fa97bc45a01802e4"
