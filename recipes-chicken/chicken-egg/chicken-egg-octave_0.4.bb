SECTION = "devel/chicken"
DESCRIPTION = "Interface to GNU/Octave"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://octave.meta;md5=8f31b9c320ba96676e29cb8121d71fb2"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/octave/octave-${PV}.tar.gz"

SRC_URI[md5sum] = "bea4c89477577694fd34ad60573ae145"
SRC_URI[sha256sum] = "ad011e028e2a36362528413d3561f9165df76d2f0e2fdbc039c1285a91ec0b8e"

S = "${WORKDIR}/octave-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
