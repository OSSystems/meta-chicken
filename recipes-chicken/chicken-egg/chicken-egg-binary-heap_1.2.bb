SECTION = "devel/chicken"
DESCRIPTION = "Binary heap."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://binary-heap.meta;md5=c6b63022a9f307d5c754bacb65cbeeba"
DEPENDS_append_class-cross = " chicken-egg-datatype-cross chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-datatype-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-datatype nativesdk-chicken-egg-matchable chicken-egg-datatype-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-datatype chicken-egg-matchable chicken-egg-datatype-cross chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-datatype chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/binary-heap/binary-heap-${PV}.tar.gz"

SRC_URI[md5sum] = "9abf0f33c437192a27bc60dce366a15e"
SRC_URI[sha256sum] = "8409e32c793b4a64eb897c390b04d1d1b054e5eb8c6d4b6d06ead7975f14b6a1"

S = "${WORKDIR}/binary-heap-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
