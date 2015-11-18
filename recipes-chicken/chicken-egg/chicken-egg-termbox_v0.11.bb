SECTION = "devel/chicken"
DESCRIPTION = "Library for writing text-based user interfaces"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://termbox.meta;md5=d8861d899f3893089503c52cc5c8d816"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/termbox/termbox-${PV}.tar.gz"

SRC_URI[md5sum] = "85b3d8c4d6facbe034d95f2560a48f51"
SRC_URI[sha256sum] = "9b7f8829eb309f3669db06c85ce7c5e4cec02fac40040cdea4ff48fb597a96a4"

S = "${WORKDIR}/termbox-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
