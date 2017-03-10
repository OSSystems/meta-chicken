SECTION = "devel/chicken"
DESCRIPTION = "Implementation of typed simple-cells to replace general set! operators"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://simple-cells.meta;md5=7ca4d20633342c35a971c355adb248f1"
DEPENDS_append_class-cross = " chicken-egg-simple-exceptions-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-simple-exceptions-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-simple-exceptions chicken-egg-simple-exceptions-crosssdk"
DEPENDS = " chicken-egg-simple-exceptions chicken-egg-simple-exceptions-cross"
RDEPENDS_${PN} = " chicken-egg-simple-exceptions"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/simple-cells/simple-cells-${PV}.tar.gz"

SRC_URI[md5sum] = "711b4405d52682ea653425ca85342d58"
SRC_URI[sha256sum] = "d2a31782c9f0986e010bf7b422ccdc02c7f995f1957149350953366adf75693e"

S = "${WORKDIR}/simple-cells-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
