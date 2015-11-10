SECTION = "devel/chicken"
DESCRIPTION = "Argument checks & errors"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://check-errors.meta;md5=08292193402dfe16a96903cf44760e42"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/check-errors/check-errors-${PV}.tar.gz"

SRC_URI[md5sum] = "530874c4d22c8f66364d1130380ef020"
SRC_URI[sha256sum] = "3a97c967e32e1e55bd88e5aecc5d65ded118eba9040e5784909d64dc655c8a2b"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
