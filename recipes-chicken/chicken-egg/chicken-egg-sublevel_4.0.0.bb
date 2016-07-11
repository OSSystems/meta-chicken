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

SRC_URI[md5sum] = "7bc017a4cf6deb67345c6fef3b6f5f6a"
SRC_URI[sha256sum] = "4024ff60c6b3009eb34f8f592163bfd4f9d6e4ff917a9fffbde8cf0d17ae665e"

S = "${WORKDIR}/sublevel-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
