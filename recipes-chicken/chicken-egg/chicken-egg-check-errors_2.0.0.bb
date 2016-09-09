SECTION = "devel/chicken"
DESCRIPTION = "Argument checks & errors"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://check-errors.meta;md5=ac22d4104e0a9d852574bc7512bf3318"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/check-errors/check-errors-${PV}.tar.gz"

SRC_URI[md5sum] = "cd0424ef877bdfb2f11e0b7ed51c9cf1"
SRC_URI[sha256sum] = "14a11cd490e591460280b4320652864a92872eeec99d81050297324c27b5d75a"

S = "${WORKDIR}/check-errors-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
