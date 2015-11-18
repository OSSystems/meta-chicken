SECTION = "devel/chicken"
DESCRIPTION = "Lexer combinators."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://lexgen.meta;md5=6a07041421ee3e22efdb0cb9cdda667b"
DEPENDS_append_class-cross = " chicken-egg-utf8-cross chicken-egg-typeclass-cross chicken-egg-input-classes-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-utf8-crosssdk chicken-egg-typeclass-crosssdk chicken-egg-input-classes-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-utf8 nativesdk-chicken-egg-typeclass nativesdk-chicken-egg-input-classes chicken-egg-utf8-crosssdk chicken-egg-typeclass-crosssdk chicken-egg-input-classes-crosssdk"
DEPENDS = " chicken-egg-utf8 chicken-egg-typeclass chicken-egg-input-classes chicken-egg-utf8-cross chicken-egg-typeclass-cross chicken-egg-input-classes-cross"
RDEPENDS_${PN} = " chicken-egg-utf8 chicken-egg-typeclass chicken-egg-input-classes"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/lexgen/lexgen-${PV}.tar.gz"

SRC_URI[md5sum] = "732ad182163dda76dd19444a08154f74"
SRC_URI[sha256sum] = "38cd6b1acca7c9220e37c15bd36e16f4109c3498deed189af397383e5d794bec"

S = "${WORKDIR}/lexgen-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
