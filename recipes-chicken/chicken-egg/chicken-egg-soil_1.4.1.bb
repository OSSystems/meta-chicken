SECTION = "devel/chicken"
DESCRIPTION = "Lightweight, simple library for loading image files into OpenGL-friendly format."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://soil.meta;md5=8ad7a71e383f10d52c406423864856a6"
DEPENDS_append_class-cross = " mesa-native"
DEPENDS_append_class-crosssdk = " mesa-native"
DEPENDS = " mesa"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/soil/soil-${PV}.tar.gz"

SRC_URI[md5sum] = "9c9a68fc49b946b72030c1a6313914cf"
SRC_URI[sha256sum] = "b04e54539544e5d022d49ecd183d2faabf3303c61d9709f2069cb0a01903397c"

S = "${WORKDIR}/soil-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
