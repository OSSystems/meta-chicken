SECTION = "devel/chicken"
DESCRIPTION = "Procedures to generate ANSI escape sequences"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://ansi-escape-sequences.meta;md5=7a5a7b8920f9bca9c9565010236c0a98"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/ansi-escape-sequences/ansi-escape-sequences-${PV}.tar.gz"

SRC_URI[md5sum] = "14fd64a0dfc4c60dc1af56fdeaa8da5e"
SRC_URI[sha256sum] = "71035ecacab3ae8ac3e5d7b17fcb707865fecae3527387570528c49e4d764d45"

S = "${WORKDIR}/ansi-escape-sequences-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
