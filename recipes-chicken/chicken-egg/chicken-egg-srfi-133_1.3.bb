SECTION = "devel/chicken"
DESCRIPTION = "SRFI-133: Vector Library (R7RS-compatible)"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-133.meta;md5=48f0c13689e5050c79d295f308f9763c"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-133/srfi-133-${PV}.tar.gz"

SRC_URI[md5sum] = "a2eba65590ec85e8a56991d7f5aa95c0"
SRC_URI[sha256sum] = "a9ae975f98531b4a5fe51da39bdfccaef96dcf947019e8bd4bca5c45e26276a3"

S = "${WORKDIR}/srfi-133-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
