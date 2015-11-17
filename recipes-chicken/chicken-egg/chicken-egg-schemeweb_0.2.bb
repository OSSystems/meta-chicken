SECTION = "devel/chicken"
DESCRIPTION = "A literate programming processor for scheme, similar to CWEB"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://schemeweb.meta;md5=2027b8f411a74e88015a038f4a8069a9"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/schemeweb/schemeweb-${PV}.tar.gz"

SRC_URI[md5sum] = "b1f56eda62d8a44f3d9339d57d5e0c7a"
SRC_URI[sha256sum] = "686fc4c61c84364430248f1272fc13f012e1444f531ff79fe893fda2f12f806a"

S = "${WORKDIR}/schemeweb-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
