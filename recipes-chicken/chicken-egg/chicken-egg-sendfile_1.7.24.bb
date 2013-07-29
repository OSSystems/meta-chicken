SECTION = "devel/chicken"
DESCRIPTION = "Sending a file over the network"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sendfile.meta;md5=c300507a211b909bdc69815095359a79"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "3957577ebb053be8bfecd02871bba236"
SRC_URI[sha256sum] = "15d6351068953f47bee3597a1228365edb3ddf12bff3286f9bb0a5dbb9deb881"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
