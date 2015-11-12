SECTION = "devel/chicken"
DESCRIPTION = "Extensible looping macros (originally based on Alex Shinn's)"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://foof-loop.meta;md5=cc6d045df515097543665bffb6ef3244"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/foof-loop/foof-loop-${PV}.tar.gz"

SRC_URI[md5sum] = "e48dc462edb23dd530d5fe3a1159c828"
SRC_URI[sha256sum] = "b3deef9f642ad269b4f50347c8b00bfe285e750bb9b1331225edf95b76389fd9"

S = "${WORKDIR}/foof-loop-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
