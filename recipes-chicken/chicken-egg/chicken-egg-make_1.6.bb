SECTION = "devel/chicken"
DESCRIPTION = "The PLT 'make' macro"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://make.meta;md5=9198c168f96325b70de4d8a040c731de"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "fe99f7d9c9b8b16084a416472e18b493"
SRC_URI[sha256sum] = "bf525cac3704ee078d7587ef11271f5804ad6dbaaa587a802a88fb96141355f3"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
