SECTION = "devel/chicken"
DESCRIPTION = "SRFI-128: Comparators (reduced)"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://comparators.meta;md5=7520017ce7c76b63619a06905acde013"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/comparators/comparators-${PV}.tar.gz"

SRC_URI[md5sum] = "853b944938082a7c738511f190b4aa77"
SRC_URI[sha256sum] = "98c28e44581d3990b9f305bbd6b6b2787afed958b1f030cebece47d0e64e17f1"

S = "${WORKDIR}/comparators-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
