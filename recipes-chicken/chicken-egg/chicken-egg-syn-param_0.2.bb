SECTION = "devel/chicken"
DESCRIPTION = "Operators with Extended Parameter Syntax"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://syn-param.meta;md5=91774a0c8f12de53abd0917d07b78efa"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/syn-param/syn-param-${PV}.tar.gz"

SRC_URI[md5sum] = "3dabbe03770c1b2b5bff684e1e065852"
SRC_URI[sha256sum] = "9a649e26f6186055176465b9567a43165eeea7b56f4328b7023abe3d950be841"

S = "${WORKDIR}/syn-param-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
