SECTION = "devel/chicken"
DESCRIPTION = "Schemely parser combinators"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://comparse.meta;md5=5ea7b7ae9130e29823bfdc7f093f74a5"
DEPENDS_append_class-cross = " chicken-egg-lazy-seq-cross chicken-egg-latch-cross chicken-egg-trie-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-lazy-seq-crosssdk chicken-egg-latch-crosssdk chicken-egg-trie-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-lazy-seq nativesdk-chicken-egg-latch nativesdk-chicken-egg-trie chicken-egg-lazy-seq-crosssdk chicken-egg-latch-crosssdk chicken-egg-trie-crosssdk"
DEPENDS = " chicken-egg-lazy-seq chicken-egg-latch chicken-egg-trie chicken-egg-lazy-seq-cross chicken-egg-latch-cross chicken-egg-trie-cross"
RDEPENDS_${PN} = " chicken-egg-lazy-seq chicken-egg-latch chicken-egg-trie"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/comparse/comparse-${PV}.tar.gz"

SRC_URI[md5sum] = "e523401a953e748cdecd303ff00e377e"
SRC_URI[sha256sum] = "88fccf2b6a0a873bd465f1bcd212ee7ff2150c24e2b71cafd1a56d76eec3c5ce"

S = "${WORKDIR}/comparse-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
