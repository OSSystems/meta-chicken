SECTION = "devel/chicken"
DESCRIPTION = "A reader extension providing precompiled regular expression literals of the form #/[a-z0-9]+/i"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://regex-literals.meta;md5=ce6a7a0784239058a9400b3f1c74715d"
DEPENDS_append_class-cross = " chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-regex chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-regex chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/regex-literals/regex-literals-${PV}.tar.gz"

SRC_URI[md5sum] = "943c9fa3d1afbecbfc572e6ac98e1ab0"
SRC_URI[sha256sum] = "076325401591707b559ccb949d2afe00d63b69c0a7be9f4575e13e43edd7c2fc"

S = "${WORKDIR}/regex-literals-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
