SECTION = "devel/chicken"
DESCRIPTION = "Interpreter for a simple ML-like language."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://miniML.meta;md5=cdb49b105387d8f5083a626733fc437a"
DEPENDS_append_class-cross = " chicken-egg-make-cross chicken-egg-static-modules-cross chicken-egg-datatype-cross chicken-egg-silex-cross chicken-egg-lalr-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-make-crosssdk chicken-egg-static-modules-crosssdk chicken-egg-datatype-crosssdk chicken-egg-silex-crosssdk chicken-egg-lalr-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-make nativesdk-chicken-egg-static-modules nativesdk-chicken-egg-datatype nativesdk-chicken-egg-silex nativesdk-chicken-egg-lalr chicken-egg-make-crosssdk chicken-egg-static-modules-crosssdk chicken-egg-datatype-crosssdk chicken-egg-silex-crosssdk chicken-egg-lalr-crosssdk"
DEPENDS = " chicken-egg-make chicken-egg-static-modules chicken-egg-datatype chicken-egg-silex chicken-egg-lalr chicken-egg-make-cross chicken-egg-static-modules-cross chicken-egg-datatype-cross chicken-egg-silex-cross chicken-egg-lalr-cross chicken-egg-miniml-cross"
RDEPENDS_${PN} = " chicken-egg-make chicken-egg-static-modules chicken-egg-datatype chicken-egg-silex chicken-egg-lalr"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/miniML/miniML-${PV}.tar.gz"

SRC_URI[md5sum] = "66a6df7af7bc83386db2780645fa4688"
SRC_URI[sha256sum] = "9d3ff4a39a039713af2b07aaf7a6df1baa2596c489c41e1609d9ebe277942bf3"

S = "${WORKDIR}/miniML-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
