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

SRC_URI[md5sum] = "f52c8fdd663e9c2bcd80da766849e79c"
SRC_URI[sha256sum] = "5559ab0404df37d11017e98fca0864b06a11619f7fc948919bad7c0a8a1d9042"

S = "${WORKDIR}/gl-math-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
