SECTION = "devel/chicken"
DESCRIPTION = "Gregor Kiczales TinyCLOS object system"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://tinyclos.meta;md5=d4393ca7b9416da8718849a52ce6235d"
DEPENDS = " chicken-egg-tinyclos-cross"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/tinyclos/tinyclos-${PV}.tar.gz"

SRC_URI[md5sum] = "e43c2cdfca5bb5a84f6ca2cf5cb11273"
SRC_URI[sha256sum] = "1b25d2ead16209a51b48fca1b44b093b6155401c29f32b4db76e1b60a3ea4400"

S = "${WORKDIR}/tinyclos-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
