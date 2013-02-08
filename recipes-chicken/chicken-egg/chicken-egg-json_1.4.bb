SECTION = "devel/chicken"
DESCRIPTION = "A JSON library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://json.meta;md5=f2ce63ea24755479f46e47788b5f459e"
DEPENDS_virtclass-cross += "chicken-egg-packrat-cross"
DEPENDS += "chicken-egg-packrat chicken-egg-packrat-cross"
RDEPENDS_${PN} += "chicken-egg-packrat"

inherit chicken_install

BBCLASSEXTEND = "cross"
