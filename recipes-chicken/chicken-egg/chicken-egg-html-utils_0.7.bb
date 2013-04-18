SECTION = "devel/chicken"
DESCRIPTION = "Procedures to ease the generation of some frequently used [X]HTML structures"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://html-utils.meta;md5=ea38559f1bf871a22854fa61d210c532"
DEPENDS_virtclass-cross += "chicken-egg-html-tags-cross"
DEPENDS += "chicken-egg-html-tags chicken-egg-html-tags-cross"
RDEPENDS_${PN} += "chicken-egg-html-tags"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "55ccf97e27f3ae1e70ec975abf946b39"
SRC_URI[sha256sum] = "bd45d9b2a3923476aab513260ac3154852cf9e8db3ae22be5695d5c6547ecdf7"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
