SECTION = "devel/chicken"
DESCRIPTION = "Implementation of typed simple-cells to replace general set! operators"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://simple-cells.meta;md5=2340a5a01d296543c9cf722cbe5b5159"
DEPENDS_append_class-cross = " chicken-egg-simple-exceptions-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-simple-exceptions-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-simple-exceptions chicken-egg-simple-exceptions-crosssdk"
DEPENDS = " chicken-egg-simple-exceptions chicken-egg-simple-exceptions-cross"
RDEPENDS_${PN} = " chicken-egg-simple-exceptions"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/simple-cells/simple-cells-${PV}.tar.gz"

SRC_URI[md5sum] = "867be709b2a63db4fcab1dd2ec1790e3"
SRC_URI[sha256sum] = "4f8ea8f1c274e990dd6bf12b7bb2942a2fb4293ae972b210fe2db782b7c2bd21"

S = "${WORKDIR}/simple-cells-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
