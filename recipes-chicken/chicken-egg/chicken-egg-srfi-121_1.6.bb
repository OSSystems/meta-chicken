SECTION = "devel/chicken"
DESCRIPTION = "SRFI-121: Generators"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-121.meta;md5=334a32e4f28d23310bb48799357abb1d"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-121/srfi-121-${PV}.tar.gz"

SRC_URI[md5sum] = "b10329d83a55cdd84af548f6d44419e7"
SRC_URI[sha256sum] = "ece19e4923c2947a0099689fa907d483c103a31c5a33ab9058e76acf4c2fcf8e"

S = "${WORKDIR}/srfi-121-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
