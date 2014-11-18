SECTION = "devel/chicken"
DESCRIPTION = "Argument checks & errors"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://check-errors.meta;md5=08292193402dfe16a96903cf44760e42"
DEPENDS_virtclass-cross += "chicken-egg-setup-helper-cross"
DEPENDS += "chicken-egg-setup-helper chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
RDEPENDS_${PN} += "chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "530874c4d22c8f66364d1130380ef020"
SRC_URI[sha256sum] = "3a97c967e32e1e55bd88e5aecc5d65ded118eba9040e5784909d64dc655c8a2b"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
