SECTION = "devel/chicken"
DESCRIPTION = "Lightweight, simple library for loading image files into OpenGL-friendly format."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://soil.meta;md5=60cb16d9bec8814902a0dc3a6d75af23"
DEPENDS_append_class-cross = " mesa-native"
DEPENDS_append_class-crosssdk = " mesa-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-mesa"
DEPENDS = " mesa"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/soil/soil-${PV}.tar.gz"

SRC_URI[md5sum] = "bbdd87b4250bfa5d44a5f9ff318dd80d"
SRC_URI[sha256sum] = "dca76a0c9dbed797a0ea75c84db9ef81e9d3c99e6ef040e4e32e1e55be28df18"

S = "${WORKDIR}/soil-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
