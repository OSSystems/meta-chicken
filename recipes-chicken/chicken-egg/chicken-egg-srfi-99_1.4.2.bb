SECTION = "devel/chicken"
DESCRIPTION = "SRFI-99 record types"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-99.meta;md5=a9319bc455905331cb6dc21a03533b45"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "9f1af2f35d3be51154b2f6cab944677b"
SRC_URI[sha256sum] = "d59328a6b62c476dff46859a321b950732021909ff46048790b84a9795db549e"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
