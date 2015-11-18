SECTION = "devel/chicken"
DESCRIPTION = "An interface to User Datagram Protocol sockets"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://udp.meta;md5=ea20c0a1edc585edabfd0860b5a21d1e"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/udp/udp-${PV}.tar.gz"

SRC_URI[md5sum] = "2539ee3a784c55989896caaa3267d9fd"
SRC_URI[sha256sum] = "6a6c3ef41ae1f8f1e2e119b8893a368234b3f668afd7cfe983b0a4a1a29c3ca9"

S = "${WORKDIR}/udp-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
