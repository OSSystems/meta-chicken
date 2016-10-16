SECTION = "devel/chicken"
DESCRIPTION = "Creating concrete-, abstract- and object-types"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://datatypes.meta;md5=638d42ae61fb64b145be397b25a8836e"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/datatypes/datatypes-${PV}.tar.gz"

SRC_URI[md5sum] = "6fa625a7712a4e86ddd6ebaf70a4a312"
SRC_URI[sha256sum] = "93928de79854ed55630005eeb584984e303ffe5dd938f15611c66b3ebc8f1537"

S = "${WORKDIR}/datatypes-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
