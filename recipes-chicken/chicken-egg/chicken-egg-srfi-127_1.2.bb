SECTION = "devel/chicken"
DESCRIPTION = "SRFI-127: Lazy Sequences"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-127.meta;md5=b66be4d4df9e558e6b03d580f59b73c9"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-127/srfi-127-${PV}.tar.gz"

SRC_URI[md5sum] = "731d5acc811e0e2670e207cded61391a"
SRC_URI[sha256sum] = "df7b3b90aa75126338114a10666c769a288e311924895cb5566e3bdbb63d20a6"

S = "${WORKDIR}/srfi-127-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
