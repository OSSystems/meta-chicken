SECTION = "devel/chicken"
DESCRIPTION = "A JSON library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://json.meta;md5=f2ce63ea24755479f46e47788b5f459e"
DEPENDS_virtclass-cross += "chicken-egg-packrat-cross"
DEPENDS += "chicken-egg-packrat chicken-egg-packrat-cross"
RDEPENDS_${PN} += "chicken-egg-packrat"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "068191955f8bd770690b92bb1cac2867"
SRC_URI[sha256sum] = "208005ff5ed5e74dd96645654a638296c56c86eaac8cb939a415a6000283faf0"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
