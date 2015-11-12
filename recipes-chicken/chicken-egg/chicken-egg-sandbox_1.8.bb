SECTION = "devel/chicken"
DESCRIPTION = "A safe evaluation environment"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sandbox.meta;md5=0949b695944481f4123f78096b592ef9"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross chicken-egg-defstruct-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk chicken-egg-defstruct-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable nativesdk-chicken-egg-defstruct chicken-egg-matchable-crosssdk chicken-egg-defstruct-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-defstruct chicken-egg-matchable-cross chicken-egg-defstruct-cross"
RDEPENDS_${PN} = " chicken-egg-matchable chicken-egg-defstruct"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sandbox/sandbox-${PV}.tar.gz"

SRC_URI[md5sum] = "2dfab73d9cfcde652e105ccb935e2636"
SRC_URI[sha256sum] = "df693728f15915ec938582626600fd621ceaffdd0f0b43e62371146ddb526524"

S = "${WORKDIR}/sandbox-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
