SECTION = "devel/chicken"
DESCRIPTION = "enhanced scheduler"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://high-load-scheduler.meta;md5=20b289d53eb041ed10ada9b3ed6a1bb4"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/high-load-scheduler/high-load-scheduler-${PV}.tar.gz"

SRC_URI[md5sum] = "52b97de9cee103e3ccee36c25196b044"
SRC_URI[sha256sum] = "072a1ff69caf41f681e283901b1e4886557494e8094f38b7e7bbffaad38210e6"

S = "${WORKDIR}/high-load-scheduler-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
