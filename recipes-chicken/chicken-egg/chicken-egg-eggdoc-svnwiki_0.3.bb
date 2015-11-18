SECTION = "devel/chicken"
DESCRIPTION = "Render eggdoc source to svnwiki syntax"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://eggdoc-svnwiki.meta;md5=96a9a8201907372ea86d8f53fd4ca8ad"
DEPENDS_append_class-cross = " chicken-egg-sxml-transforms-cross chicken-egg-sxpath-cross chicken-egg-eggdoc-cross chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-sxml-transforms-crosssdk chicken-egg-sxpath-crosssdk chicken-egg-eggdoc-crosssdk chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-sxml-transforms nativesdk-chicken-egg-sxpath nativesdk-chicken-egg-eggdoc nativesdk-chicken-egg-regex chicken-egg-sxml-transforms-crosssdk chicken-egg-sxpath-crosssdk chicken-egg-eggdoc-crosssdk chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-sxml-transforms chicken-egg-sxpath chicken-egg-eggdoc chicken-egg-regex chicken-egg-sxml-transforms-cross chicken-egg-sxpath-cross chicken-egg-eggdoc-cross chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-sxml-transforms chicken-egg-sxpath chicken-egg-eggdoc chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/eggdoc-svnwiki/eggdoc-svnwiki-${PV}.tar.gz"

SRC_URI[md5sum] = "1ecd12f8126c17f585a879a80ccc1143"
SRC_URI[sha256sum] = "518ad1cab01d0ad75bab21eda61530792ef30f5902e0d1d16956adbc96518816"

S = "${WORKDIR}/eggdoc-svnwiki-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
