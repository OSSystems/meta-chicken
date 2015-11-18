SECTION = "devel/chicken"
DESCRIPTION = "Tweens"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://tween.meta;md5=b957a5fec344cdf5305ade55b6f5ca14"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/tween/tween-${PV}.tar.gz"

SRC_URI[md5sum] = "d258b4d976b155584bfd655fd25c4ef9"
SRC_URI[sha256sum] = "a2bef65c549947c91af0fccb755f155581b0cbbf7b3d1499e676bffb906793f4"

S = "${WORKDIR}/tween-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
