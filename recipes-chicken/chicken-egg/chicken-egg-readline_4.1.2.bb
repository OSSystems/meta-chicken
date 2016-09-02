SECTION = "devel/chicken"
DESCRIPTION = "An interface to the GNU readline library"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://readline.meta;md5=366122a7f1f6da18fef7dfc2d0f52ba2"
DEPENDS_append_class-cross = " readline-native"
DEPENDS_append_class-crosssdk = " readline-native"
DEPENDS_append_class-nativesdk = " nativesdk-readline"
DEPENDS = " readline"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/readline/readline-${PV}.tar.gz"

SRC_URI[md5sum] = "e1af1ffe0e99ffddfcb2feb7b77c05d9"
SRC_URI[sha256sum] = "3c4b4f731c0dc7ea3269cc03789a50784dc18da608b13ece05d1d28ec5fbf31f"

S = "${WORKDIR}/readline-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
