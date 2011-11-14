inherit chicken_install

SECTION = "devel/chicken"
DESCRIPTION = "Foreign helper macros for Chicken 4"
DEPENDS_virtclass-cross += "chicken-cross chicken-egg-matchable-cross"
DEPENDS += "chicken chicken-egg-matchable chicken-egg-matchable-cross"
RDEPENDS += "chicken-egg-matchable"

BBCLASSEXTEND = "cross"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://foreigners.meta;md5=c207c0505eab1b907b43de637c70de81"
