inherit chicken_install

SECTION = "devel/chicken"
DESCRIPTION = "Procedures to ease the generation of some frequently used [X]HTML structures"
DEPENDS_virtclass-cross += "chicken-cross chicken-egg-html-tags-cross"
DEPENDS += "chicken chicken-egg-html-tags chicken-egg-html-tags-cross"
RDEPENDS += "chicken-egg-html-tags"

BBCLASSEXTEND = "cross"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://html-utils.meta;md5=ea38559f1bf871a22854fa61d210c532"
