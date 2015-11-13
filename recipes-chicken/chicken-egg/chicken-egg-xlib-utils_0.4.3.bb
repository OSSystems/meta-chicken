SECTION = "devel/chicken"
DESCRIPTION = "utils for xlib programming"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://xlib-utils.meta;md5=d8757afb805aec5cf4268d6449bac301"
DEPENDS_append_class-cross = " chicken-egg-foreigners-cross chicken-egg-matchable-cross chicken-egg-miscmacros-cross chicken-egg-xlib-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-foreigners-crosssdk chicken-egg-matchable-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-xlib-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-foreigners nativesdk-chicken-egg-matchable nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-xlib chicken-egg-foreigners-crosssdk chicken-egg-matchable-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-xlib-crosssdk"
DEPENDS = " chicken-egg-foreigners chicken-egg-matchable chicken-egg-miscmacros chicken-egg-xlib chicken-egg-foreigners-cross chicken-egg-matchable-cross chicken-egg-miscmacros-cross chicken-egg-xlib-cross"
RDEPENDS_${PN} = " chicken-egg-foreigners chicken-egg-matchable chicken-egg-miscmacros chicken-egg-xlib"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/xlib-utils/xlib-utils-${PV}.tar.gz"

SRC_URI[md5sum] = "eba0587a95c9d391ea2df7c7f963a203"
SRC_URI[sha256sum] = "de570b942c441413ac3b1c37d49d1347b81ff64747e07f4d77267b1f8cfe593c"

S = "${WORKDIR}/xlib-utils-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
