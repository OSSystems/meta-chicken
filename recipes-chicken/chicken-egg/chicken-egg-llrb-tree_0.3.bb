SECTION = "devel/chicken"
DESCRIPTION = "LLRB tree general and customized to key types."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://llrb-tree.meta;md5=963dcd3954e43d560a00ddb9e125c658"
DEPENDS_append_class-cross = " chicken-egg-llrb-syntax-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-llrb-syntax-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-llrb-syntax chicken-egg-llrb-syntax-crosssdk"
DEPENDS = " chicken-egg-llrb-syntax chicken-egg-llrb-syntax-cross"
RDEPENDS_${PN} = " chicken-egg-llrb-syntax"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/llrb-tree/llrb-tree-${PV}.tar.gz"

SRC_URI[md5sum] = "8820b8c3c155d2899a1cdee907dd572c"
SRC_URI[sha256sum] = "c5b781d2404ab93b942dfb22d8982735fb4562be1542e58c04faf1b49ee7560d"

S = "${WORKDIR}/llrb-tree-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
