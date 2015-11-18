SECTION = "devel/chicken"
DESCRIPTION = "An efficient LALR(1) parser generator"
LICENSE = "LGPL-3"
LIC_FILES_CHKSUM = "file://lalr.meta;md5=24eefbcbb7734978dc41fc7a04c48141"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/lalr/lalr-${PV}.tar.gz"

SRC_URI[md5sum] = "d1b48e877c9954ae3fddd7413f03e0c1"
SRC_URI[sha256sum] = "54c74d3344e11d64b2b4e5f6d61f1c533c748ccacf8226f1dac2a3dfa4273797"

S = "${WORKDIR}/lalr-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
