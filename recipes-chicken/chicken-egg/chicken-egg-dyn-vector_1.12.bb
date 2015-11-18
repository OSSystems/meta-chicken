SECTION = "devel/chicken"
DESCRIPTION = "Dynamic (dense) vectors based on SRFI-43."
LICENSE = "LGPL-3"
LIC_FILES_CHKSUM = "file://dyn-vector.meta;md5=dd59e0aeb699020773b115ba4030705e"
DEPENDS_append_class-cross = " chicken-egg-vector-lib-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-vector-lib-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-vector-lib chicken-egg-vector-lib-crosssdk"
DEPENDS = " chicken-egg-vector-lib chicken-egg-vector-lib-cross"
RDEPENDS_${PN} = " chicken-egg-vector-lib"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/dyn-vector/dyn-vector-${PV}.tar.gz"

SRC_URI[md5sum] = "10796409962ffcb5b4220f346d16537b"
SRC_URI[sha256sum] = "ca1a260ffa7a1022c464eb7d67b6fc478872c49a22f948549cc2438cb3e8f6a3"

S = "${WORKDIR}/dyn-vector-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
