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

SRC_URI[md5sum] = "c595c699344c6ee7296508356f4f1f2d"
SRC_URI[sha256sum] = "eaa38422b25d7eef14fd7cd81c2f57c9dc193b832750935e720315ae6d4a4949"

S = "${WORKDIR}/srfi-45-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
