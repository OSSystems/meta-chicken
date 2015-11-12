SECTION = "devel/chicken"
DESCRIPTION = "Implementation of the Remote Frame Buffer protocol"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://rfb.meta;md5=88ef6bb7fb4cd0291c507493556ab086"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross chicken-egg-defstruct-cross chicken-egg-regex-case-cross chicken-egg-miscmacros-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk chicken-egg-defstruct-crosssdk chicken-egg-regex-case-crosssdk chicken-egg-miscmacros-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable nativesdk-chicken-egg-defstruct nativesdk-chicken-egg-regex-case nativesdk-chicken-egg-miscmacros chicken-egg-matchable-crosssdk chicken-egg-defstruct-crosssdk chicken-egg-regex-case-crosssdk chicken-egg-miscmacros-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-defstruct chicken-egg-regex-case chicken-egg-miscmacros chicken-egg-matchable-cross chicken-egg-defstruct-cross chicken-egg-regex-case-cross chicken-egg-miscmacros-cross"
RDEPENDS_${PN} = " chicken-egg-matchable chicken-egg-defstruct chicken-egg-regex-case chicken-egg-miscmacros"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/rfb/rfb-${PV}.tar.gz"

SRC_URI[md5sum] = "5c2fb2b476d4e535ad85f9e5af82d358"
SRC_URI[sha256sum] = "12b299939d203c79f61e2e7a3c7094805b26f562aaf46ff01f2109b8dab5cdb8"

S = "${WORKDIR}/rfb-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
