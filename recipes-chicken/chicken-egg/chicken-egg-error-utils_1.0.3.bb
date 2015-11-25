SECTION = "devel/chicken"
DESCRIPTION = "Error Utilities"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://error-utils.meta;md5=586ad5e6c36ddb8b027b3e7e533aaa34"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-moremacros-cross chicken-egg-variable-item-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-moremacros-crosssdk chicken-egg-variable-item-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-moremacros nativesdk-chicken-egg-variable-item chicken-egg-setup-helper-crosssdk chicken-egg-moremacros-crosssdk chicken-egg-variable-item-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-moremacros chicken-egg-variable-item chicken-egg-setup-helper-cross chicken-egg-moremacros-cross chicken-egg-variable-item-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-moremacros chicken-egg-variable-item"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/error-utils/error-utils-${PV}.tar.gz"

SRC_URI[md5sum] = "1a21e47bd4816b30e96c27d05dc3dd23"
SRC_URI[sha256sum] = "2cd48220876b76efde7c93f87fe4822731bfca1b3d01cf89172130e98d2a4383"

S = "${WORKDIR}/error-utils-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
