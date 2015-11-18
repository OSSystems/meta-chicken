SECTION = "devel/chicken"
DESCRIPTION = "Parse svnwiki to sxml"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://svnwiki-sxml.meta;md5=d500dbaf29114f95486e3fcae1b8c95b"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross chicken-egg-html-parser-cross chicken-egg-sxml-transforms-cross chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk chicken-egg-html-parser-crosssdk chicken-egg-sxml-transforms-crosssdk chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable nativesdk-chicken-egg-html-parser nativesdk-chicken-egg-sxml-transforms nativesdk-chicken-egg-regex chicken-egg-matchable-crosssdk chicken-egg-html-parser-crosssdk chicken-egg-sxml-transforms-crosssdk chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-html-parser chicken-egg-sxml-transforms chicken-egg-regex chicken-egg-matchable-cross chicken-egg-html-parser-cross chicken-egg-sxml-transforms-cross chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-matchable chicken-egg-html-parser chicken-egg-sxml-transforms chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/svnwiki-sxml/svnwiki-sxml-${PV}.tar.gz"

SRC_URI[md5sum] = "ae096ee3ced9d073c85bc1721c90cbaf"
SRC_URI[sha256sum] = "526c936c88e3da5ea8d2dbd11df9ecc3d94105bc41b0112f840f09faa41a89a7"

S = "${WORKDIR}/svnwiki-sxml-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
