SECTION = "devel/chicken"
DESCRIPTION = "OSSP UUID"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://uuid-ossp.meta;md5=c42bd68297087fc007132c0e2b54769f"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross ossp-uuid-native"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk ossp-uuid-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper ossp-uuid chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/uuid-ossp/uuid-ossp-${PV}.tar.gz"

SRC_URI[md5sum] = "03113188269e46b7eddd984f83764dee"
SRC_URI[sha256sum] = "ed7f6eb5df2c18628cec8212947ae3b25119f94e64e0197f01505e01f06ab221"

S = "${WORKDIR}/uuid-ossp-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
