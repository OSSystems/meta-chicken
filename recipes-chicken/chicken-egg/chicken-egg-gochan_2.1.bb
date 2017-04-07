SECTION = "devel/chicken"
DESCRIPTION = "golang channels in CHICKEN"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://gochan.meta;md5=caa07c29a3b109bf643b889d06524fc8"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/gochan/gochan-${PV}.tar.gz"

SRC_URI[md5sum] = "cb4b42097c0d88c967c43490e9c0b70d"
SRC_URI[sha256sum] = "fb452622c721b398f9b2dfa8fc22d58c42019340b9956cdbe084292b362505fe"

S = "${WORKDIR}/gochan-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
