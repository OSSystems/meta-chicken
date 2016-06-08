SECTION = "devel/chicken"
DESCRIPTION = "Simple software transactional memory."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://hopefully.meta;md5=ba9afeb016ae9dfe2cfb0ddf56e820ba"
DEPENDS_append_class-cross = " chicken-egg-llrb-tree-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-llrb-tree-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-llrb-tree chicken-egg-llrb-tree-crosssdk"
DEPENDS = " chicken-egg-llrb-tree chicken-egg-llrb-tree-cross"
RDEPENDS_${PN} = " chicken-egg-llrb-tree"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/hopefully/hopefully-${PV}.tar.gz"

SRC_URI[md5sum] = "486019ca4b6ff265569dea52c0ff6deb"
SRC_URI[sha256sum] = "e25392813c18929d968fc49b3b819e20f109be09b58fdcf7f45e6994d27bd15c"

S = "${WORKDIR}/hopefully-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
