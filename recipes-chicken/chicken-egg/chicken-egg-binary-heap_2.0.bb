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

SRC_URI[md5sum] = "1e0491cbb2d284235f5ad582e4ee3757"
SRC_URI[sha256sum] = "86a8023096847774c22ecd92bf09468c903df1f157703def8b570c7b9b51d9b1"

S = "${WORKDIR}/binary-heap-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
