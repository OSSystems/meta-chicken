SECTION = "devel/chicken"
DESCRIPTION = "Tweens"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://tween.meta;md5=b957a5fec344cdf5305ade55b6f5ca14"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/tween/tween-${PV}.tar.gz"

SRC_URI[md5sum] = "0ab19eb064f7533ada2620a0f98003e7"
SRC_URI[sha256sum] = "5776863b2b604202b578b10fdc6ba87b6a940df2ed42327fc6b7c91b573a512e"

S = "${WORKDIR}/tween-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
