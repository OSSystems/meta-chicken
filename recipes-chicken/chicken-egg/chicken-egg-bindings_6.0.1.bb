SECTION = "devel/chicken"
DESCRIPTION = "Pattern matching with destructuring bindings"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://bindings.meta;md5=0534ed50ab0794e4da256c71b33321df"
DEPENDS_append_class-cross = " chicken-egg-simple-exceptions-cross chicken-egg-basic-sequences-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-simple-exceptions-crosssdk chicken-egg-basic-sequences-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-simple-exceptions nativesdk-chicken-egg-basic-sequences chicken-egg-simple-exceptions-crosssdk chicken-egg-basic-sequences-crosssdk"
DEPENDS = " chicken-egg-simple-exceptions chicken-egg-basic-sequences chicken-egg-simple-exceptions-cross chicken-egg-basic-sequences-cross chicken-egg-bindings-cross"
RDEPENDS_${PN} = " chicken-egg-simple-exceptions chicken-egg-basic-sequences"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/bindings/bindings-${PV}.tar.gz"

SRC_URI[md5sum] = "34683821e7f487ec730728f1bf8f9d63"
SRC_URI[sha256sum] = "44921070c96686050662ca2f139fdd5dbc4131948b5a92d3040422cf70012e29"

S = "${WORKDIR}/bindings-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
