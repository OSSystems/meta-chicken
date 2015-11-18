SECTION = "devel/chicken"
DESCRIPTION = "UNIX domain sockets"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://unix-sockets.meta;md5=bd6c0f3ecca64edcad98024a8cea52ff"
DEPENDS_append_class-cross = " chicken-egg-easyffi-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-easyffi-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-easyffi chicken-egg-easyffi-crosssdk"
DEPENDS = " chicken-egg-easyffi chicken-egg-easyffi-cross"
RDEPENDS_${PN} = " chicken-egg-easyffi"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/unix-sockets/unix-sockets-${PV}.tar.gz"

SRC_URI[md5sum] = "5e5617faab8638db9379b5c810941a11"
SRC_URI[sha256sum] = "1753d2853c876e25e58e70f8e5449f4698fff0bd27783a564fa03e999a0bfc3c"

S = "${WORKDIR}/unix-sockets-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
