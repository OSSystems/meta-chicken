SECTION = "devel/chicken"
DESCRIPTION = "A JSON parser (and emitter) built with comparse"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://medea.meta;md5=288ee4d0c936dfe4c23abd1147db1065"
DEPENDS_append_class-cross = " chicken-egg-comparse-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-comparse-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-comparse chicken-egg-comparse-crosssdk"
DEPENDS = " chicken-egg-comparse chicken-egg-comparse-cross"
RDEPENDS_${PN} = " chicken-egg-comparse"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/medea/medea-${PV}.tar.gz"

SRC_URI[md5sum] = "1a08a6af41c7f72cf0beca53d6990250"
SRC_URI[sha256sum] = "d26570679de3d2d78d3a8859016ea05e2d2059f1b42ba454888ce4d8fdbd805a"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
