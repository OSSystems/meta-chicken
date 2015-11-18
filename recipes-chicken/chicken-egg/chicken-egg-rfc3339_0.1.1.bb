SECTION = "devel/chicken"
DESCRIPTION = "RFC3339 datetime parser"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://rfc3339.meta;md5=8b53b4d15ab6bfe5ac375ce12a454fc5"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable nativesdk-chicken-egg-regex chicken-egg-matchable-crosssdk chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-regex chicken-egg-matchable-cross chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-matchable chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/rfc3339/rfc3339-${PV}.tar.gz"

SRC_URI[md5sum] = "b9776d68601bd336f7a6aee4c6b124e2"
SRC_URI[sha256sum] = "2d759d6a561a2c78db12c4b76c0be258d69bba334aeb792b477e339b21a3db8d"

S = "${WORKDIR}/rfc3339-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
