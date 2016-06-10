SECTION = "devel/chicken"
DESCRIPTION = "An interface to the GNU readline library"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://readline.meta;md5=0e4a890de24f3766c261814dcab4fabf"
DEPENDS_append_class-cross = " readline-native"
DEPENDS_append_class-crosssdk = " readline-native"
DEPENDS_append_class-nativesdk = " nativesdk-readline"
DEPENDS = " readline"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/readline/readline-${PV}.tar.gz"

SRC_URI[md5sum] = "4fc5378a14a9b60589c772470a9588a8"
SRC_URI[sha256sum] = "2f2652ffaeb6c7eb37401a3052a1ce0342517049850658777f4a9fb81dcc6528"

S = "${WORKDIR}/readline-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
