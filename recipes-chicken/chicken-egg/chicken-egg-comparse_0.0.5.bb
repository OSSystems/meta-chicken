SECTION = "devel/chicken"
DESCRIPTION = "Schemely parser combinators"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://comparse.meta;md5=7697a2e2af43ecdf4e7d9a69d0811f16"
DEPENDS_virtclass-cross += "chicken-egg-lazy-seq-cross chicken-egg-latch-cross chicken-egg-trie-cross"
DEPENDS += "chicken-egg-lazy-seq chicken-egg-latch chicken-egg-trie chicken-egg-lazy-seq-cross chicken-egg-latch-cross chicken-egg-trie-cross"
RDEPENDS_${PN} += "chicken-egg-lazy-seq chicken-egg-latch chicken-egg-trie"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "838681231b1056501fad04ea40ef72e7"
SRC_URI[sha256sum] = "6d22b820a2cf8dbcad86215f151fa74faca4de3c6d6967fbd01acb008b7d6db2"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
