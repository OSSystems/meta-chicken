SECTION = "devel/chicken"
DESCRIPTION = "Oleg Kiselyov's XML parser"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://ssax.meta;md5=835a961265c6391fbe0c0b03e3c17bd7"
DEPENDS_virtclass-cross += "chicken-egg-input-parse-cross"
DEPENDS += "chicken-egg-input-parse chicken-egg-input-parse-cross"
RDEPENDS_${PN} += "chicken-egg-input-parse"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "f6d89ab2f6a321cf83a88dcfc629341b"
SRC_URI[sha256sum] = "37ea2b60db1ac5920fb8b7565dbaf6b973d8e79b4a628e7f8fc4d07259c56307"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
