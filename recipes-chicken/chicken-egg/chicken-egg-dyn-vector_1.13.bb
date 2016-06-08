SECTION = "devel/chicken"
DESCRIPTION = "Dynamic (dense) vectors based on SRFI-43."
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://dyn-vector.meta;md5=dd59e0aeb699020773b115ba4030705e"
DEPENDS_append_class-cross = " chicken-egg-vector-lib-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-vector-lib-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-vector-lib chicken-egg-vector-lib-crosssdk"
DEPENDS = " chicken-egg-vector-lib chicken-egg-vector-lib-cross"
RDEPENDS_${PN} = " chicken-egg-vector-lib"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/dyn-vector/dyn-vector-${PV}.tar.gz"

SRC_URI[md5sum] = "148ba0a99d90b3eddd2b8810921e1706"
SRC_URI[sha256sum] = "90b18b3df33e32fe1bf3c9371334aeb8cfb6c499343a1ddd630e80bd94db78e7"

S = "${WORKDIR}/dyn-vector-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
