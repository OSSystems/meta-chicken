SECTION = "devel/chicken"
DESCRIPTION = "Bindings to BerkeleyDB"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://berkeley-db.meta;md5=0a8dd7cdc91fd9961e5257516460cf9a"
DEPENDS_append_class-cross = " db-native"
DEPENDS_append_class-crosssdk = " db-native"
DEPENDS = " db"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/berkeley-db/berkeley-db-${PV}.tar.gz"

SRC_URI[md5sum] = "aa7899dc2c4ab90f1292d1e282f36122"
SRC_URI[sha256sum] = "8c299b69292f5502b2424d74d2348c01038d69acd5a064a6ac81c015d594871b"

S = "${WORKDIR}/berkeley-db-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
