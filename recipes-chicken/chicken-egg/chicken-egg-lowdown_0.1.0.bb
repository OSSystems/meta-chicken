SECTION = "devel/chicken"
DESCRIPTION = "A pure Chicken Markdown parser"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://lowdown.meta;md5=e8ad47a9886c8764791d436e637a45e8"
DEPENDS_append_class-cross = " chicken-egg-comparse-cross chicken-egg-clojurian-cross chicken-egg-latch-cross chicken-egg-sxml-transforms-cross chicken-egg-char-set-literals-cross chicken-egg-fancypants-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-comparse-crosssdk chicken-egg-clojurian-crosssdk chicken-egg-latch-crosssdk chicken-egg-sxml-transforms-crosssdk chicken-egg-char-set-literals-crosssdk chicken-egg-fancypants-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-comparse nativesdk-chicken-egg-clojurian nativesdk-chicken-egg-latch nativesdk-chicken-egg-sxml-transforms nativesdk-chicken-egg-char-set-literals nativesdk-chicken-egg-fancypants chicken-egg-comparse-crosssdk chicken-egg-clojurian-crosssdk chicken-egg-latch-crosssdk chicken-egg-sxml-transforms-crosssdk chicken-egg-char-set-literals-crosssdk chicken-egg-fancypants-crosssdk"
DEPENDS = " chicken-egg-comparse chicken-egg-clojurian chicken-egg-latch chicken-egg-sxml-transforms chicken-egg-char-set-literals chicken-egg-fancypants chicken-egg-comparse-cross chicken-egg-clojurian-cross chicken-egg-latch-cross chicken-egg-sxml-transforms-cross chicken-egg-char-set-literals-cross chicken-egg-fancypants-cross chicken-egg-lowdown-cross"
RDEPENDS_${PN} = " chicken-egg-comparse chicken-egg-clojurian chicken-egg-latch chicken-egg-sxml-transforms chicken-egg-char-set-literals chicken-egg-fancypants"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/lowdown/lowdown-${PV}.tar.gz"

SRC_URI[md5sum] = "cd0af7979bccb894c1b3a201621a0dd7"
SRC_URI[sha256sum] = "f4f14d346377f8e1ca3090fd89cfaf5f0f54cf140a55d6d5e013bddd402d54dd"

S = "${WORKDIR}/lowdown-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
