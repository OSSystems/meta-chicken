SECTION = "devel/chicken"
DESCRIPTION = "local expressions as procedures with named parameters"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://holes.meta;md5=cd20f3211fd718e133bc21574fb0c2e4"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/holes/holes-${PV}.tar.gz"

SRC_URI[md5sum] = "b29274b9e7b28019e9500f1c436e3a0c"
SRC_URI[sha256sum] = "4762729881e11835d35f86afda11e2b77fd149e83faeb84156d1a9d4ba1b46bb"

S = "${WORKDIR}/holes-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
