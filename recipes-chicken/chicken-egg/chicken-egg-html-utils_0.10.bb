SECTION = "devel/chicken"
DESCRIPTION = "Procedures to ease the generation of some frequently used [X]HTML/SXML structures"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://html-utils.meta;md5=853a82baebc676b58c852a858a48dd5f"
DEPENDS_class-cross += "chicken-egg-html-tags-cross"
DEPENDS += "chicken-egg-html-tags chicken-egg-html-tags-cross"
RDEPENDS_${PN} += "chicken-egg-html-tags"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "7a8a85f11aa03529b686468599606db6"
SRC_URI[sha256sum] = "a39a7e85cf11c55671fefa38f5af11fdd7d6f9d6f98fa837321e61226e862b77"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
