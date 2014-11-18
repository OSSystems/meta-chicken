SECTION = "devel/chicken"
DESCRIPTION = "Sending a file over the network"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sendfile.meta;md5=c300507a211b909bdc69815095359a79"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "814138bb3445730b7b02b0d76c2955fe"
SRC_URI[sha256sum] = "2d1852be83513735e0e68b38c5b02892e3b35debcbee3acc7795f5fc6dc9ae97"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
