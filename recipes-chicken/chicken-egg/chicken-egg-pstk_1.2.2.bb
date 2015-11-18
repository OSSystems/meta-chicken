SECTION = "devel/chicken"
DESCRIPTION = "PS/Tk: Portable Scheme interface to Tk"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://pstk.meta;md5=8c4216e24949be051d96eedfd8a1a6f0"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/pstk/pstk-${PV}.tar.gz"

SRC_URI[md5sum] = "d1dccbfb37fdbd730881403196edba8d"
SRC_URI[sha256sum] = "90f61e739f1942f88046f94780350450766a8deb153a9d9fe0002ed093c904f9"

S = "${WORKDIR}/pstk-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
