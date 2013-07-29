SECTION = "devel/chicken"
DESCRIPTION = "A JSON parser (and emitter) built with comparse"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://medea.meta;md5=db7d04912484e098bdd154c24d05bf6a"
DEPENDS_virtclass-cross += "chicken-egg-comparse-cross"
DEPENDS += "chicken-egg-comparse chicken-egg-comparse-cross"
RDEPENDS_${PN} += "chicken-egg-comparse"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "54e5fed9ebbc38aec205864221adb2c6"
SRC_URI[sha256sum] = "a1d8a27b23f41f6c611e60e3f3a6f26e58e61f12b760f5996f3adb8ec5764497"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
