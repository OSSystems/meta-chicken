SECTION = "devel/chicken"
DESCRIPTION = "An interface to the (deprecated) Yelp v1.0 API"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://yelp.meta;md5=c8e85a324c78056cd8b8a1c986b02eae"
DEPENDS_append_class-cross = " chicken-egg-json-cross chicken-egg-http-client-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-json-crosssdk chicken-egg-http-client-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-json nativesdk-chicken-egg-http-client chicken-egg-json-crosssdk chicken-egg-http-client-crosssdk"
DEPENDS = " chicken-egg-json chicken-egg-http-client chicken-egg-json-cross chicken-egg-http-client-cross"
RDEPENDS_${PN} = " chicken-egg-json chicken-egg-http-client"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/yelp/yelp-${PV}.tar.gz"

SRC_URI[md5sum] = "d02a27b450e740c6f4df3e14809f6dcd"
SRC_URI[sha256sum] = "a27e2868a3037888df83790af4664bbff909297c2fcc023954b14fd94b39f92e"

S = "${WORKDIR}/yelp-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
