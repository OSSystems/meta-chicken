SECTION = "devel/chicken"
DESCRIPTION = "JQuery-based Javascript validators for autoform"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://autoform-jquery.meta;md5=258c736425a7e642b6007d6d028e2be5"
DEPENDS_append_class-cross = " chicken-egg-autoform-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-autoform-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-autoform chicken-egg-autoform-crosssdk"
DEPENDS = " chicken-egg-autoform chicken-egg-autoform-cross"
RDEPENDS_${PN} = " chicken-egg-autoform"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/autoform-jquery/autoform-jquery-${PV}.tar.gz"

SRC_URI[md5sum] = "43d800e36efd087440baf0f5905adc54"
SRC_URI[sha256sum] = "6132c7c8f8f876c69a8284887bcf7075218c7c93b5a6c2773ce97ad3acc2c45a"

S = "${WORKDIR}/autoform-jquery-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
