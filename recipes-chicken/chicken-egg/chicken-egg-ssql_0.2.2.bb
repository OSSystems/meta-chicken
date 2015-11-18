SECTION = "devel/chicken"
DESCRIPTION = "SQL as S-expressions"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://ssql.meta;md5=e246d17e8e2a18e29e7153acea750516"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-matchable-cross chicken-egg-ssql-cross"
RDEPENDS_${PN} = " chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/ssql/ssql-${PV}.tar.gz"

SRC_URI[md5sum] = "81cd3e4e2fe29f9573073e8e7a2e3aad"
SRC_URI[sha256sum] = "5794a78cc7f01c1431b32409573851a39ce1bbadf6655c6639669a336247a2e4"

S = "${WORKDIR}/ssql-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
