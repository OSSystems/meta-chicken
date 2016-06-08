SECTION = "devel/chicken"
DESCRIPTION = "Namespaced access to leveldb implementations"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sublevel.meta;md5=0ddb7115ccd308fcd389b620ce444f6b"
DEPENDS_append_class-cross = " chicken-egg-level-cross chicken-egg-interfaces-cross chicken-egg-lazy-seq-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-level-crosssdk chicken-egg-interfaces-crosssdk chicken-egg-lazy-seq-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-level nativesdk-chicken-egg-interfaces nativesdk-chicken-egg-lazy-seq chicken-egg-level-crosssdk chicken-egg-interfaces-crosssdk chicken-egg-lazy-seq-crosssdk"
DEPENDS = " chicken-egg-level chicken-egg-interfaces chicken-egg-lazy-seq chicken-egg-level-cross chicken-egg-interfaces-cross chicken-egg-lazy-seq-cross"
RDEPENDS_${PN} = " chicken-egg-level chicken-egg-interfaces chicken-egg-lazy-seq"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sublevel/sublevel-${PV}.tar.gz"

SRC_URI[md5sum] = "7ac36e637fce9e1dc29d4d0cfffc5030"
SRC_URI[sha256sum] = "0af55b354a071699ae5ef877e2263b2423a4bcec6c7130cfec38a94d8143b6c0"

S = "${WORKDIR}/sublevel-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
