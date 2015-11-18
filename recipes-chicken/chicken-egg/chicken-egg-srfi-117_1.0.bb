SECTION = "devel/chicken"
DESCRIPTION = "List Queues."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-117.meta;md5=c1b840db23733dad00710bb821185003"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-117/srfi-117-${PV}.tar.gz"

SRC_URI[md5sum] = "782a548d5c3bfdab35d5f0a8fb8daeec"
SRC_URI[sha256sum] = "f5e2944afef71cf960bf5d6bcc623183a27c9c8b775800461032caabdadf41b0"

S = "${WORKDIR}/srfi-117-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
