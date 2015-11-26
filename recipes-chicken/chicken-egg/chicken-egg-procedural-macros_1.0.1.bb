SECTION = "devel/chicken"
DESCRIPTION = "Procedural-macros made easy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://procedural-macros.meta;md5=30e64d93f978bc22201937ffc8516d14"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/procedural-macros/procedural-macros-${PV}.tar.gz"

SRC_URI[md5sum] = "a6eeeb69e0d7f69b11e6d1b5b5540354"
SRC_URI[sha256sum] = "6d6a656f05e326e1adc161ea54606ecaec1485ebde6c9e8f833694bc2db435ac"

S = "${WORKDIR}/procedural-macros-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
