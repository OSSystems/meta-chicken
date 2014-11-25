SECTION = "devel/chicken"
DESCRIPTION = "Schemely parser combinators"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://comparse.meta;md5=7f609215d3f4c25fac874a4b42960923"
DEPENDS_append_class-cross = " chicken-egg-lazy-seq-cross chicken-egg-latch-cross chicken-egg-trie-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-lazy-seq-crosssdk chicken-egg-latch-crosssdk chicken-egg-trie-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-lazy-seq nativesdk-chicken-egg-latch nativesdk-chicken-egg-trie chicken-egg-lazy-seq-crosssdk chicken-egg-latch-crosssdk chicken-egg-trie-crosssdk"
DEPENDS = " chicken-egg-lazy-seq chicken-egg-latch chicken-egg-trie chicken-egg-lazy-seq-cross chicken-egg-latch-cross chicken-egg-trie-cross"
RDEPENDS_${PN} = " chicken-egg-lazy-seq chicken-egg-latch chicken-egg-trie"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "0abf303d6e0dd0b3f926a14d4654435f"
SRC_URI[sha256sum] = "9d4b6e7c723a3faab93b115b078cc03703b700985d124e725a33e5b522ae7e7e"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
