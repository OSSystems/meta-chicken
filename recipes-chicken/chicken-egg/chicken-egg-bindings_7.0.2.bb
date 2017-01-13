SECTION = "devel/chicken"
DESCRIPTION = "Pattern matching with destructuring bindings"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://bindings.meta;md5=0a2b8583ab85d1f9a5742b65cc7ffd95"
DEPENDS_append_class-cross = " chicken-egg-simple-exceptions-cross chicken-egg-basic-sequences-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-simple-exceptions-crosssdk chicken-egg-basic-sequences-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-simple-exceptions nativesdk-chicken-egg-basic-sequences chicken-egg-simple-exceptions-crosssdk chicken-egg-basic-sequences-crosssdk"
DEPENDS = " chicken-egg-simple-exceptions chicken-egg-basic-sequences chicken-egg-simple-exceptions-cross chicken-egg-basic-sequences-cross chicken-egg-bindings-cross"
RDEPENDS_${PN} = " chicken-egg-simple-exceptions chicken-egg-basic-sequences"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/bindings/bindings-${PV}.tar.gz"

SRC_URI[md5sum] = "20de3030926c50bbb5f8b3250a9e6c81"
SRC_URI[sha256sum] = "c9a5ffa7f557da2efdfd4eda076b97623b28ffb12935b142484d3ce98ee51a81"

S = "${WORKDIR}/bindings-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
