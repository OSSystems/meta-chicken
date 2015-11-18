SECTION = "devel/chicken"
DESCRIPTION = "Parser combinators for Augmented BNF grammars (RFC 4234)."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://abnf.meta;md5=630bc5fbe1884e114e967460c1c4b062"
DEPENDS_append_class-cross = " chicken-egg-utf8-cross chicken-egg-typeclass-cross chicken-egg-input-classes-cross chicken-egg-suffix-tree-cross chicken-egg-lexgen-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-utf8-crosssdk chicken-egg-typeclass-crosssdk chicken-egg-input-classes-crosssdk chicken-egg-suffix-tree-crosssdk chicken-egg-lexgen-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-utf8 nativesdk-chicken-egg-typeclass nativesdk-chicken-egg-input-classes nativesdk-chicken-egg-suffix-tree nativesdk-chicken-egg-lexgen chicken-egg-utf8-crosssdk chicken-egg-typeclass-crosssdk chicken-egg-input-classes-crosssdk chicken-egg-suffix-tree-crosssdk chicken-egg-lexgen-crosssdk"
DEPENDS = " chicken-egg-utf8 chicken-egg-typeclass chicken-egg-input-classes chicken-egg-suffix-tree chicken-egg-lexgen chicken-egg-utf8-cross chicken-egg-typeclass-cross chicken-egg-input-classes-cross chicken-egg-suffix-tree-cross chicken-egg-lexgen-cross chicken-egg-abnf-cross"
RDEPENDS_${PN} = " chicken-egg-utf8 chicken-egg-typeclass chicken-egg-input-classes chicken-egg-suffix-tree chicken-egg-lexgen"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/abnf/abnf-${PV}.tar.gz"

SRC_URI[md5sum] = "a26078e8c3884128c4b9b3279d93d7bc"
SRC_URI[sha256sum] = "08f40d456bb4ef1a0ff450d5636b64cb3840c2a6df823de631eb092796f12bfb"

S = "${WORKDIR}/abnf-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
