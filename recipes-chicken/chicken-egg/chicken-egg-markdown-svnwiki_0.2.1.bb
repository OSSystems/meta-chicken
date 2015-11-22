SECTION = "devel/chicken"
DESCRIPTION = "Convert Markdown to svnwiki"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://markdown-svnwiki.meta;md5=1ba446c481e477b5eedac78c223ee6e2"
DEPENDS_append_class-cross = " chicken-egg-lowdown-cross chicken-egg-sxml-transforms-cross chicken-egg-miscmacros-cross chicken-egg-srfi-37-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-lowdown-crosssdk chicken-egg-sxml-transforms-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-srfi-37-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-lowdown nativesdk-chicken-egg-sxml-transforms nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-srfi-37 chicken-egg-lowdown-crosssdk chicken-egg-sxml-transforms-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-srfi-37-crosssdk"
DEPENDS = " chicken-egg-lowdown chicken-egg-sxml-transforms chicken-egg-miscmacros chicken-egg-srfi-37 chicken-egg-lowdown-cross chicken-egg-sxml-transforms-cross chicken-egg-miscmacros-cross chicken-egg-srfi-37-cross chicken-egg-markdown-svnwiki-cross"
RDEPENDS_${PN} = " chicken-egg-lowdown chicken-egg-sxml-transforms chicken-egg-miscmacros chicken-egg-srfi-37"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/markdown-svnwiki/markdown-svnwiki-${PV}.tar.gz"

SRC_URI[md5sum] = "df26d8508bb7abbed907db77b1a58403"
SRC_URI[sha256sum] = "22d0f6289507e18ea93d8e86abb5ea0560c62d8023ad60cb3184dd38170d1782"

S = "${WORKDIR}/markdown-svnwiki-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
