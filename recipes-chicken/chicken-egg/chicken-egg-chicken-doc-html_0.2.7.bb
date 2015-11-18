SECTION = "devel/chicken"
DESCRIPTION = "Generate HTML from (svn)wiki SXML"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://chicken-doc-html.meta;md5=dd89dbaf06294534f7eaf48ee6a53113"
DEPENDS_append_class-cross = " chicken-egg-regex-cross chicken-egg-matchable-cross chicken-egg-sxml-transforms-cross chicken-egg-colorize-cross chicken-egg-svnwiki-sxml-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-regex-crosssdk chicken-egg-matchable-crosssdk chicken-egg-sxml-transforms-crosssdk chicken-egg-colorize-crosssdk chicken-egg-svnwiki-sxml-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-regex nativesdk-chicken-egg-matchable nativesdk-chicken-egg-sxml-transforms nativesdk-chicken-egg-colorize nativesdk-chicken-egg-svnwiki-sxml chicken-egg-regex-crosssdk chicken-egg-matchable-crosssdk chicken-egg-sxml-transforms-crosssdk chicken-egg-colorize-crosssdk chicken-egg-svnwiki-sxml-crosssdk"
DEPENDS = " chicken-egg-regex chicken-egg-matchable chicken-egg-sxml-transforms chicken-egg-colorize chicken-egg-svnwiki-sxml chicken-egg-regex-cross chicken-egg-matchable-cross chicken-egg-sxml-transforms-cross chicken-egg-colorize-cross chicken-egg-svnwiki-sxml-cross"
RDEPENDS_${PN} = " chicken-egg-regex chicken-egg-matchable chicken-egg-sxml-transforms chicken-egg-colorize chicken-egg-svnwiki-sxml"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/chicken-doc-html/chicken-doc-html-${PV}.tar.gz"

SRC_URI[md5sum] = "34b49efef3cf28e21b64d77033a7a0d0"
SRC_URI[sha256sum] = "061ed0ef40b6021746f00c6c0370088cee580e2004d0e342ad10b2de3c7dba29"

S = "${WORKDIR}/chicken-doc-html-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
