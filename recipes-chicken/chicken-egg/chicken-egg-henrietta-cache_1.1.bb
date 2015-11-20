SECTION = "devel/chicken"
DESCRIPTION = "Fetch and cache extensions from various sources for Henrietta to consume"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://henrietta-cache.meta;md5=9ffd4d09bbfca06e224aaeb81471b087"
DEPENDS_append_class-cross = " chicken-egg-http-client-cross chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-http-client-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-http-client nativesdk-chicken-egg-matchable chicken-egg-http-client-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-http-client chicken-egg-matchable chicken-egg-http-client-cross chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-http-client chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/henrietta-cache/henrietta-cache-${PV}.tar.gz"

SRC_URI[md5sum] = "f2702d7a21f618c66e7c14a5ede512d2"
SRC_URI[sha256sum] = "6482b12d89e78fe38f8430fe9bd5da5546d3487fad9fdb9dd8bed5c0159dc56b"

S = "${WORKDIR}/henrietta-cache-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
