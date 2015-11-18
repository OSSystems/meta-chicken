SECTION = "devel/chicken"
DESCRIPTION = "An actor model library, inspired by Erlang"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://hardwood.meta;md5=c6451ec4b16ea72b9eb2786268b9c40f"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross chicken-egg-uuid-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk chicken-egg-uuid-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable nativesdk-chicken-egg-uuid chicken-egg-matchable-crosssdk chicken-egg-uuid-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-uuid chicken-egg-matchable-cross chicken-egg-uuid-cross"
RDEPENDS_${PN} = " chicken-egg-matchable chicken-egg-uuid"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/hardwood/hardwood-${PV}.tar.gz"

SRC_URI[md5sum] = "1d92ff39bf28fc1e8cdd1dff4bea93f3"
SRC_URI[sha256sum] = "1b2c76b0968f127b6b2d82aa814b5455914942697e33cf05ea0c6a6222d1dbed"

S = "${WORKDIR}/hardwood-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
