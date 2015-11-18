SECTION = "devel/chicken"
DESCRIPTION = "The CMA-ES library for non-linear function minimization."
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://cmaes.meta;md5=f8afbfa1ac46e61f7e27b315a9b979d8"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/cmaes/cmaes-${PV}.tar.gz"

SRC_URI[md5sum] = "584edcc3dcb12dde1759c9ec92ff306d"
SRC_URI[sha256sum] = "d1a4d5f641beb79b0b5a43fecba049017454b9f4c72970f5f6f5ceebc942a6ed"

S = "${WORKDIR}/cmaes-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
