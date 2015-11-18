SECTION = "devel/chicken"
DESCRIPTION = "Multidimensional arrays"
LICENSE = "SRFI"
LIC_FILES_CHKSUM = "file://srfi-25.meta;md5=a75d8c3abf681f450946a07d00219692"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-25/srfi-25-${PV}.tar.gz"

SRC_URI[md5sum] = "fdcb306b350a38c7e7b148c784124a64"
SRC_URI[sha256sum] = "96e503546397f8fbca5d6f6441b0008edc1baeafeafc6a3870b87bb032ab8191"

S = "${WORKDIR}/srfi-25-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
