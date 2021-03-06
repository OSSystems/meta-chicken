SECTION = "devel/chicken"
DESCRIPTION = "The SXML transformations (to XML, SXML, and HTML) from the SSAX project at Sourceforge"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://sxml-transforms.meta;md5=b91742093976faad3692506be6713298"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sxml-transforms/sxml-transforms-${PV}.tar.gz"

SRC_URI[md5sum] = "4b8150b477ca4df77bcdb7e0707e7112"
SRC_URI[sha256sum] = "1746da291c75fe03ec8ed5241a348b5f8f4fd9bb5d61cd4dcb793eeb49231e5a"

S = "${WORKDIR}/sxml-transforms-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
