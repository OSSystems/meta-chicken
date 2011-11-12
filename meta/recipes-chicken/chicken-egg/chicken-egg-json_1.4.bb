inherit chicken_install

SECTION = "devel/chicken"
DESCRIPTION = "A JSON library"
DEPENDS_virtclass-cross += "chicken-cross chicken-egg-packrat-cross"
DEPENDS += "chicken chicken-egg-packrat chicken-egg-packrat-cross"
RDEPENDS += "chicken-egg-packrat"

BBCLASSEXTEND = "cross"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://json.meta;md5=f2ce63ea24755479f46e47788b5f459e"
