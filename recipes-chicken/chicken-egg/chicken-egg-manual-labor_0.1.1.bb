SECTION = "devel/chicken"
DESCRIPTION = "Generate static HTML manual from wiki docs"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://manual-labor.meta;md5=b891992837cb43162916204bf359c9b7"
DEPENDS_append_class-cross = " chicken-egg-regex-cross chicken-egg-matchable-cross chicken-egg-svnwiki-sxml-cross chicken-egg-uri-generic-cross chicken-egg-chicken-doc-html-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-regex-crosssdk chicken-egg-matchable-crosssdk chicken-egg-svnwiki-sxml-crosssdk chicken-egg-uri-generic-crosssdk chicken-egg-chicken-doc-html-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-regex nativesdk-chicken-egg-matchable nativesdk-chicken-egg-svnwiki-sxml nativesdk-chicken-egg-uri-generic nativesdk-chicken-egg-chicken-doc-html chicken-egg-regex-crosssdk chicken-egg-matchable-crosssdk chicken-egg-svnwiki-sxml-crosssdk chicken-egg-uri-generic-crosssdk chicken-egg-chicken-doc-html-crosssdk"
DEPENDS = " chicken-egg-regex chicken-egg-matchable chicken-egg-svnwiki-sxml chicken-egg-uri-generic chicken-egg-chicken-doc-html chicken-egg-regex-cross chicken-egg-matchable-cross chicken-egg-svnwiki-sxml-cross chicken-egg-uri-generic-cross chicken-egg-chicken-doc-html-cross chicken-egg-manual-labor-cross"
RDEPENDS_${PN} = " chicken-egg-regex chicken-egg-matchable chicken-egg-svnwiki-sxml chicken-egg-uri-generic chicken-egg-chicken-doc-html"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/manual-labor/manual-labor-${PV}.tar.gz"

SRC_URI[md5sum] = "73de890830e07a68397e80e894a7e16d"
SRC_URI[sha256sum] = "f09fb193634af9b444dbbbf1eb9856c8f8079aea9dd0b68d6d8b2dd234174241"

S = "${WORKDIR}/manual-labor-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
