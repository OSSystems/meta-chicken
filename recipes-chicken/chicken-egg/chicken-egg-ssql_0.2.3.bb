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

SRC_URI[md5sum] = "04120a3010c995687fbafdfef8d7b269"
SRC_URI[sha256sum] = "3ee9b5b54d34ae70b1bb42d41b3e0b0df955b7b57f92005e16420c268261821b"

S = "${WORKDIR}/ssql-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
