SECTION = "devel/chicken"
DESCRIPTION = "Apache CouchDB client library"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://couchdb.meta;md5=7547f58e03abff9c21d4b88da9704163"
DEPENDS_append_class-cross = " chicken-egg-http-client-cross chicken-egg-intarweb-cross chicken-egg-json-cross chicken-egg-uri-common-cross chicken-egg-defstruct-cross chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-http-client-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-json-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-defstruct-crosssdk chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-http-client nativesdk-chicken-egg-intarweb nativesdk-chicken-egg-json nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-defstruct nativesdk-chicken-egg-regex chicken-egg-http-client-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-json-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-defstruct-crosssdk chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-http-client chicken-egg-intarweb chicken-egg-json chicken-egg-uri-common chicken-egg-defstruct chicken-egg-regex chicken-egg-http-client-cross chicken-egg-intarweb-cross chicken-egg-json-cross chicken-egg-uri-common-cross chicken-egg-defstruct-cross chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-http-client chicken-egg-intarweb chicken-egg-json chicken-egg-uri-common chicken-egg-defstruct chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/couchdb/couchdb-${PV}.tar.gz"

SRC_URI[md5sum] = "b79e2c0ccc3d2c97abbf822ebda5ead5"
SRC_URI[sha256sum] = "ccf5d57214b3c0dc873bda7fc242547384730b1e16e28774d6635c74d0054304"

S = "${WORKDIR}/couchdb-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
