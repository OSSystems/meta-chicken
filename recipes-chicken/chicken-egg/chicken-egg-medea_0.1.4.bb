SECTION = "devel/chicken"
DESCRIPTION = "A JSON parser (and emitter) built with comparse"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://medea.meta;md5=db7d04912484e098bdd154c24d05bf6a"
DEPENDS_virtclass-cross += "chicken-egg-comparse-cross"
DEPENDS += "chicken-egg-comparse chicken-egg-comparse-cross"
RDEPENDS_${PN} += "chicken-egg-comparse"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "24d3e3daf3fe1dd9e4688b7017f327ab"
SRC_URI[sha256sum] = "cf71a49b759d7a4ef1ad0721fc4446fb2489531bedc331a3ec3d03062e052165"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
