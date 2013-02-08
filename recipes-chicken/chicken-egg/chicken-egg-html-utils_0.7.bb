SECTION = "devel/chicken"
DESCRIPTION = "Procedures to ease the generation of some frequently used [X]HTML structures"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://html-utils.meta;md5=ea38559f1bf871a22854fa61d210c532"
DEPENDS_virtclass-cross += "chicken-egg-html-tags-cross"
DEPENDS += "chicken-egg-html-tags chicken-egg-html-tags-cross"
RDEPENDS_${PN} += "chicken-egg-html-tags"

inherit chicken_install

BBCLASSEXTEND = "cross"
