SECTION = "devel/chicken"
DESCRIPTION = "Some simple looping macros"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://loops.meta;md5=96bb79671629a870dc605fa109540014"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/loops/loops-${PV}.tar.gz"

SRC_URI[md5sum] = "701d76b35b357daa78d73154fc10af90"
SRC_URI[sha256sum] = "d6a5ecf7e70f10d648285017060bc2f2c6df3f196a8ddf89ecd88973ed9105c2"

S = "${WORKDIR}/loops-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
