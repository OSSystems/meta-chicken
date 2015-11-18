SECTION = "devel/chicken"
DESCRIPTION = "basic Scheme48 module syntax"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://s48-modules.meta;md5=093e49dd95eb33793196dae391c84c0c"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/s48-modules/s48-modules-${PV}.tar.gz"

SRC_URI[md5sum] = "f3c8f302c8305b2b95339c5f6c8a304b"
SRC_URI[sha256sum] = "c46d032d8a859c62918ce0236feda005e68cc2f61efa9e17ccc67b3048b9a50c"

S = "${WORKDIR}/s48-modules-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
