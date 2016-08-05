SECTION = "devel/chicken"
DESCRIPTION = "Design by contract"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://dbc.meta;md5=2d328ac8aac92c747f14b4b18dd0d3d6"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/dbc/dbc-${PV}.tar.gz"

SRC_URI[md5sum] = "a60bca728031810ed1b9f24a9218247b"
SRC_URI[sha256sum] = "9f137032eb925b665beabaab9d40c0ea559fff8f22fe6ffdca064043a3945ca9"

S = "${WORKDIR}/dbc-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
