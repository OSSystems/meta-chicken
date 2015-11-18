SECTION = "devel/chicken"
DESCRIPTION = "Automatically compile Scheme scripts on demand"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://autocompile.meta;md5=5106ce847311ac5221a5b72d0bd9bde9"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable nativesdk-chicken-egg-regex chicken-egg-matchable-crosssdk chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-regex chicken-egg-matchable-cross chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-matchable chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/autocompile/autocompile-${PV}.tar.gz"

SRC_URI[md5sum] = "0fdef45464e3e554eef5e8f26321a151"
SRC_URI[sha256sum] = "abff67c228b2d96ab9d604585c8b20f661b40dc5d3dc1a565cda1d2233039640"

S = "${WORKDIR}/autocompile-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
