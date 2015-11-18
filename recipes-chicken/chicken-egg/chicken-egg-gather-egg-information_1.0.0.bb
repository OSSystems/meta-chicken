SECTION = "devel/chicken"
DESCRIPTION = "A replacement for CHICKEN core's gather-egg-information which works with both old and new henrietta-cache cache formats"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://gather-egg-information.meta;md5=6b3274f95be2562fd4fb45e602877aac"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/gather-egg-information/gather-egg-information-${PV}.tar.gz"

SRC_URI[md5sum] = "4baa3fdd9ffe83ef8ea670f135ae782c"
SRC_URI[sha256sum] = "3f2f124fb9e185da32e58dd4abc716b688969aff2cc827975093c83dcb73213f"

S = "${WORKDIR}/gather-egg-information-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
