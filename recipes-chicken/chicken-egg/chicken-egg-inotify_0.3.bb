SECTION = "devel/chicken"
DESCRIPTION = "Bindings to inotify"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://inotify.meta;md5=edd85930f3377935bed18f41f6964488"
DEPENDS = " chicken-egg-inotify-cross"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/inotify/inotify-${PV}.tar.gz"

SRC_URI[md5sum] = "6d7c36dfdd388f2d94a0f83378f2ec5d"
SRC_URI[sha256sum] = "1c4ab0d19ffdd94c53c279d8f5402e5665869226dd64baa6daa783bdf20d5fe1"

S = "${WORKDIR}/inotify-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
