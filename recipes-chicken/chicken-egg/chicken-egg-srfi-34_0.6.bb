SECTION = "devel/chicken"
DESCRIPTION = "SRFI-34: Exception Handling for Programs"
LICENSE = "SRFI"
LIC_FILES_CHKSUM = "file://srfi-34.meta;md5=2cb268728a87a863a14d6a5ea3fc1536"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-34/srfi-34-${PV}.tar.gz"

SRC_URI[md5sum] = "c85c64612d032e18147b80f358d13b5c"
SRC_URI[sha256sum] = "83eadab98549e85cdda507be6d820b0a1d9956b268896f99b05fa90d079e701e"

S = "${WORKDIR}/srfi-34-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
