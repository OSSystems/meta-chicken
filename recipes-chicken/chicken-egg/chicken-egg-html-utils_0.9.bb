SECTION = "devel/chicken"
DESCRIPTION = "Procedures to ease the generation of some frequently used [X]HTML/SXML structures"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://html-utils.meta;md5=853a82baebc676b58c852a858a48dd5f"
DEPENDS_virtclass-cross += "chicken-egg-html-tags-cross"
DEPENDS += "chicken-egg-html-tags chicken-egg-html-tags-cross"
RDEPENDS_${PN} += "chicken-egg-html-tags"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "8bdb7d9d8b73da3ae94eb8d6d4fbee95"
SRC_URI[sha256sum] = "320628bd19e110020f11d30936c13b10108e166174da643834505ed6f8ac7e29"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
