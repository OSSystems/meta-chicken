SECTION = "devel/chicken"
DESCRIPTION = "Port of the SRFI-43 reference implementation"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://vector-lib.meta;md5=a12936beec8d7b2710010211a2d544cc"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/vector-lib/vector-lib-${PV}.tar.gz"

SRC_URI[md5sum] = "f9f5f7df0877f08abc555fabf270b202"
SRC_URI[sha256sum] = "9480c862c3d66bf29c9002c4856545d8dde125247279d08c54fc59347ee18252"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
