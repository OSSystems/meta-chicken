SECTION = "devel/chicken"
DESCRIPTION = "A permissive, scalable HTML parser."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://html-parser.meta;md5=31d73434193ee9aa836d88008c17b690"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "c9c9b07c7124ce9e04773f6413a6af26"
SRC_URI[sha256sum] = "39bf6d6dee1d7892db5364f7c83d5eb72486b12cfeb25a8185024ca2e75a1ea9"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
