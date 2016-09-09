SECTION = "devel/chicken"
DESCRIPTION = "ISO C math functions and constants"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://mathh.meta;md5=bc82eb022e9d104240ac891b46bce800"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/mathh/mathh-${PV}.tar.gz"

SRC_URI[md5sum] = "585f13ae0d35af700e312ea0c983191a"
SRC_URI[sha256sum] = "9eb4b2fc588053b512330bc8cacfe6ab3c2171f8fcad82c92f26bbb21cd21277"

S = "${WORKDIR}/mathh-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
