SECTION = "devel/chicken"
DESCRIPTION = "An interface to the GNU readline library"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://readline.meta;md5=ec413c0b700bc474c49b9bcc7418df78"
DEPENDS_append_class-cross = " readline-native"
DEPENDS_append_class-crosssdk = " readline-native"
DEPENDS_append_class-nativesdk = " nativesdk-readline"
DEPENDS = " readline"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/readline/readline-${PV}.tar.gz"

SRC_URI[md5sum] = "d3df703c2a49d80a5a05fc076e2847b5"
SRC_URI[sha256sum] = "6f46f1572da68bbf466af8fd43f381d8cea7eb2bf8cd8c36afe4c19090f0130c"

S = "${WORKDIR}/readline-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
