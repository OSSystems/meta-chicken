SECTION = "devel/chicken"
DESCRIPTION = "A reader extension providing Gauche style literals for SRFI-14 char-sets"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://char-set-literals.meta;md5=d850621263c14a3030f4529dad3fb331"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/char-set-literals/char-set-literals-${PV}.tar.gz"

SRC_URI[md5sum] = "7c97e41a8d0d27d2ff1850fc16cee023"
SRC_URI[sha256sum] = "1b453c9609f88522861f3c9a5490eceead5d0dd7bd8a3993555e3dbb5353b04f"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
