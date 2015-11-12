SECTION = "devel/chicken"
DESCRIPTION = "Utility for creating animations from a series of images"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://animation.meta;md5=9fceabc148334ff258b3cd97412f3d80"
DEPENDS_append_class-cross = " chicken-egg-format-cross chicken-egg-hahn-cross chicken-egg-matchable-cross chicken-egg-miscmacros-cross chicken-egg-shell-cross chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-format-crosssdk chicken-egg-hahn-crosssdk chicken-egg-matchable-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-shell-crosssdk chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-format nativesdk-chicken-egg-hahn nativesdk-chicken-egg-matchable nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-shell nativesdk-chicken-egg-setup-helper chicken-egg-format-crosssdk chicken-egg-hahn-crosssdk chicken-egg-matchable-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-shell-crosssdk chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-format chicken-egg-hahn chicken-egg-matchable chicken-egg-miscmacros chicken-egg-shell chicken-egg-setup-helper chicken-egg-format-cross chicken-egg-hahn-cross chicken-egg-matchable-cross chicken-egg-miscmacros-cross chicken-egg-shell-cross chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-format chicken-egg-hahn chicken-egg-matchable chicken-egg-miscmacros chicken-egg-shell chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/animation/animation-${PV}.tar.gz"

SRC_URI[md5sum] = "1f4d60e373deb694150642eb53df0a81"
SRC_URI[sha256sum] = "b3706895612a7fe320ea618abe8192cc5ee55e23fc39d578803fbd0bda352eec"

S = "${WORKDIR}/animation-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
