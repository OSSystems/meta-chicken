SECTION = "devel/chicken"
DESCRIPTION = "Type classes and transformer functions for input streams used by lexgen/abnf and related libraries."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://input-classes.meta;md5=6f3ec6dc8235935dab54dc879220ee97"
DEPENDS_append_class-cross = " chicken-egg-typeclass-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-typeclass-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-typeclass chicken-egg-typeclass-crosssdk"
DEPENDS = " chicken-egg-typeclass chicken-egg-typeclass-cross"
RDEPENDS_${PN} = " chicken-egg-typeclass"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/input-classes/input-classes-${PV}.tar.gz"

SRC_URI[md5sum] = "88219bc92ada6ea8bf091fbd1b30a895"
SRC_URI[sha256sum] = "84b69918f07f98e00a64893ef64d6fd1a70414c20fd1b98da740eed2ae32ea3c"

S = "${WORKDIR}/input-classes-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
