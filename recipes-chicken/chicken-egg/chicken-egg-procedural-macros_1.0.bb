SECTION = "devel/chicken"
DESCRIPTION = "Procedural-macros made easy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://procedural-macros.meta;md5=30e64d93f978bc22201937ffc8516d14"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/procedural-macros/procedural-macros-${PV}.tar.gz"

SRC_URI[md5sum] = "c7f4f6db144599bc694c05636e577752"
SRC_URI[sha256sum] = "8e83dc6d47dbfba5e56f7a408d058179993b0b7cc48894b89148a6e1861e5ed9"

S = "${WORKDIR}/procedural-macros-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
