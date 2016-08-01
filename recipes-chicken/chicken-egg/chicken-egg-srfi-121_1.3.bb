SECTION = "devel/chicken"
DESCRIPTION = "SRFI-121: Generators"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-121.meta;md5=334a32e4f28d23310bb48799357abb1d"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-121/srfi-121-${PV}.tar.gz"

SRC_URI[md5sum] = "f0c3ae31d54d9e319fedacc0e5d3352b"
SRC_URI[sha256sum] = "4f7d940b43a80bc6b2c29e12a814a1bd85a783fc3a284fc06004d729ee00e211"

S = "${WORKDIR}/srfi-121-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
