SECTION = "devel/chicken"
DESCRIPTION = "List Queues."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-117.meta;md5=798c4252bc4a45dfd6969d0cc5b92274"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-117/srfi-117-${PV}.tar.gz"

SRC_URI[md5sum] = "df27868788e201cd9cd75dc6e02f609d"
SRC_URI[sha256sum] = "b8ae6e155ac5404b660c155f86ad373b463783602686fc64185d5189566c2973"

S = "${WORKDIR}/srfi-117-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
