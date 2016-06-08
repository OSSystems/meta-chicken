SECTION = "devel/chicken"
DESCRIPTION = "A small gamedev-oriented math library"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://gl-math.meta;md5=0cefda7817caed82b001ef3e52ab1107"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/gl-math/gl-math-${PV}.tar.gz"

SRC_URI[md5sum] = "c225b5487ddf637e0d860affe2b3102f"
SRC_URI[sha256sum] = "792037358b92ad13c654f4103d24010c18c185eddeb1438d7fd2de96a96c9378"

S = "${WORKDIR}/gl-math-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
