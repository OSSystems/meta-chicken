SECTION = "devel/chicken"
DESCRIPTION = "List Queues."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-117.meta;md5=4679033bea7f8b7c007c31b7caf1e38c"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-117/srfi-117-${PV}.tar.gz"

SRC_URI[md5sum] = "92878ca4052e424943fb13e4427ff5ec"
SRC_URI[sha256sum] = "f1f47fa9cc4a221e07330f81f7accb9fef310c138327aefed05e79153127e324"

S = "${WORKDIR}/srfi-117-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
