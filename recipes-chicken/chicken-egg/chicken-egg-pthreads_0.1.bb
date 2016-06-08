SECTION = "devel/chicken"
DESCRIPTION = "Maintain and talk to a pthread pool."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://pthreads.meta;md5=44e27b1cdb978ad28ca4a721303d96df"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/pthreads/pthreads-${PV}.tar.gz"

SRC_URI[md5sum] = "3c2375682881a13eff528f40dd3ad3c7"
SRC_URI[sha256sum] = "73a2862deec1210b097ed1bbdefe46674f79e20ff95cd7c59bd8299d0a885744"

S = "${WORKDIR}/pthreads-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
