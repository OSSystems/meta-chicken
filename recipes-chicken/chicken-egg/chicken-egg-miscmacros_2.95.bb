SECTION = "devel/chicken"
DESCRIPTION = "Various helper macros"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://miscmacros.meta;md5=04fe25a9e0effaa01799eb2d76e6aad2"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "ad45c18f5c3cc42757ac35e0b18a1555"
SRC_URI[sha256sum] = "2a5774e8bbde7bafb751fa9f80351268a1c00c02d3d90a911f158c9721da951d"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
