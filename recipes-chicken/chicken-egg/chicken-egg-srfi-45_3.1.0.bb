SECTION = "devel/chicken"
DESCRIPTION = "Primitives for Expressing Iterative Lazy Algorithms"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-45.meta;md5=0dd425f9921a8ec3878ce2f8fbb3047c"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-check-errors chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-check-errors"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-45/srfi-45-${PV}.tar.gz"

SRC_URI[md5sum] = "14c3bd6b135a45884c66868219ff082a"
SRC_URI[sha256sum] = "d129acf87870e429fdc296840a3684cee5368dc2c7c777b33e452f60a6d2594e"

S = "${WORKDIR}/srfi-45-${PV}"

require chicken-egg-srfi-45.inc

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
