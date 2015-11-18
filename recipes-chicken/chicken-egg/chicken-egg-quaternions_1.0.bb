SECTION = "devel/chicken"
DESCRIPTION = "Quaternions library"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://quaternions.meta;md5=484f206597d9f89e2b745dfca610f749"
DEPENDS_append_class-cross = " chicken-egg-numbers-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-numbers-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-numbers chicken-egg-numbers-crosssdk"
DEPENDS = " chicken-egg-numbers chicken-egg-numbers-cross"
RDEPENDS_${PN} = " chicken-egg-numbers"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/quaternions/quaternions-${PV}.tar.gz"

SRC_URI[md5sum] = "d04355acc24f72852c238ce7a7cf6014"
SRC_URI[sha256sum] = "6f1291da012f528496145bc0ad51f6d265df474a67eb08d31b2f397cdb8fba24"

S = "${WORKDIR}/quaternions-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
