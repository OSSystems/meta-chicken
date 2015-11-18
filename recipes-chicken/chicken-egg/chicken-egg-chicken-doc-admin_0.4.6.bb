SECTION = "devel/chicken"
DESCRIPTION = "Administer Chicken documentation locally"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://chicken-doc-admin.meta;md5=14e051046dea55d8c03efc62fa48b697"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross chicken-egg-chicken-doc-cross chicken-egg-html-parser-cross chicken-egg-sxml-transforms-cross chicken-egg-svnwiki-sxml-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk chicken-egg-chicken-doc-crosssdk chicken-egg-html-parser-crosssdk chicken-egg-sxml-transforms-crosssdk chicken-egg-svnwiki-sxml-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable nativesdk-chicken-egg-chicken-doc nativesdk-chicken-egg-html-parser nativesdk-chicken-egg-sxml-transforms nativesdk-chicken-egg-svnwiki-sxml chicken-egg-matchable-crosssdk chicken-egg-chicken-doc-crosssdk chicken-egg-html-parser-crosssdk chicken-egg-sxml-transforms-crosssdk chicken-egg-svnwiki-sxml-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-chicken-doc chicken-egg-html-parser chicken-egg-sxml-transforms chicken-egg-svnwiki-sxml chicken-egg-matchable-cross chicken-egg-chicken-doc-cross chicken-egg-html-parser-cross chicken-egg-sxml-transforms-cross chicken-egg-svnwiki-sxml-cross chicken-egg-chicken-doc-admin-cross"
RDEPENDS_${PN} = " chicken-egg-matchable chicken-egg-chicken-doc chicken-egg-html-parser chicken-egg-sxml-transforms chicken-egg-svnwiki-sxml"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/chicken-doc-admin/chicken-doc-admin-${PV}.tar.gz"

SRC_URI[md5sum] = "2993fda6ff2faafe5a4b360885db21cf"
SRC_URI[sha256sum] = "9396a3a165d2ccc2f828d46d05fbede28cf6a6ebbd21727ab9e94adfe652e778"

S = "${WORKDIR}/chicken-doc-admin-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
