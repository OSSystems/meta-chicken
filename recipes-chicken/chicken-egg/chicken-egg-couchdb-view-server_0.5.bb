SECTION = "devel/chicken"
DESCRIPTION = "A Scheme view server for Apache CouchDB"
LICENSE = "LGPLv2+"
LIC_FILES_CHKSUM = "file://couchdb-view-server.meta;md5=13906910cf6fd31442a523a5684ce398"
DEPENDS_append_class-cross = " chicken-egg-json-cross chicken-egg-environments-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-json-crosssdk chicken-egg-environments-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-json nativesdk-chicken-egg-environments chicken-egg-json-crosssdk chicken-egg-environments-crosssdk"
DEPENDS = " chicken-egg-json chicken-egg-environments chicken-egg-json-cross chicken-egg-environments-cross"
RDEPENDS_${PN} = " chicken-egg-json chicken-egg-environments"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/couchdb-view-server/couchdb-view-server-${PV}.tar.gz"

SRC_URI[md5sum] = "375fc3d707faa6dbf3982c6556450792"
SRC_URI[sha256sum] = "e25903d4f2407653539fad58b9417bb8658cc74311843eb3a3f0966f4287a0cf"

S = "${WORKDIR}/couchdb-view-server-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
