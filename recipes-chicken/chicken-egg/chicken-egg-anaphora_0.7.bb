SECTION = "devel/chicken"
DESCRIPTION = "Unhygienic anaphoric macros and hygienic named macros"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://anaphora.meta;md5=a3c04dbd8fc177d6d0d63cc04cc2518d"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/anaphora/anaphora-${PV}.tar.gz"

SRC_URI[md5sum] = "2ef3d9ef8b78dc666bfad34eee6b1c44"
SRC_URI[sha256sum] = "d4f224ff68cd6b0efcab6e2537b2804972a8d282959632ffe05b63cbca4eb17a"

S = "${WORKDIR}/anaphora-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
