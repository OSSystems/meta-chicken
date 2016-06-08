SECTION = "devel/chicken"
DESCRIPTION = "Inline macro operations"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://begin-syntax.meta;md5=60e0518d75f0f32ea6cd5def8470da3a"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross chicken-egg-module-declarations-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk chicken-egg-module-declarations-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable nativesdk-chicken-egg-module-declarations chicken-egg-matchable-crosssdk chicken-egg-module-declarations-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-module-declarations chicken-egg-matchable-cross chicken-egg-module-declarations-cross"
RDEPENDS_${PN} = " chicken-egg-matchable chicken-egg-module-declarations"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/begin-syntax/begin-syntax-${PV}.tar.gz"

SRC_URI[md5sum] = "06d93743c39f55c7216285f740940890"
SRC_URI[sha256sum] = "25f2f7f91d5b891b8733587710c7618cbc1cab7834a7807fdc5520fae0dda25f"

S = "${WORKDIR}/begin-syntax-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
