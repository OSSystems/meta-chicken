SECTION = "devel/chicken"
DESCRIPTION = "HTML form constructor."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://html-form.meta;md5=6a622b6981dcad75b5b836f477364304"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/html-form/html-form-${PV}.tar.gz"

SRC_URI[md5sum] = "899c886fb4ec08228f7c65bd13853695"
SRC_URI[sha256sum] = "395811f3d2fea64c9befc1d04d68bdc583c48d70252549ec3795f716f3a089d4"

S = "${WORKDIR}/html-form-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
