SECTION = "devel/chicken"
DESCRIPTION = "Chicken bindings for Cairo, a vector graphics library"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://cairo.meta;md5=cf2ed7913ed45c0b287e33d3c06bf3ed"
DEPENDS_append_class-cross = " cairo-native"
DEPENDS_append_class-crosssdk = " cairo-native"
DEPENDS = " cairo"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/cairo/cairo-${PV}.tar.gz"

SRC_URI[md5sum] = "02e6852292a8a4f574064135d42931ae"
SRC_URI[sha256sum] = "846079c17055766fbebe53782789b357c7589a3c768bc45f074a7f7dd77efa02"

S = "${WORKDIR}/cairo-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
