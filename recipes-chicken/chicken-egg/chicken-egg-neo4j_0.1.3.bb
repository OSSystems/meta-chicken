SECTION = "devel/chicken"
DESCRIPTION = "neo4j REST client"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://neo4j.meta;md5=b48e458c4402c8845adf50383dd0be13"
DEPENDS_append_class-cross = " chicken-egg-alist-lib-cross chicken-egg-http-client-cross chicken-egg-intarweb-cross chicken-egg-json-cross chicken-egg-matchable-cross chicken-egg-medea-cross chicken-egg-setup-helper-cross chicken-egg-uri-common-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-alist-lib-crosssdk chicken-egg-http-client-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-json-crosssdk chicken-egg-matchable-crosssdk chicken-egg-medea-crosssdk chicken-egg-setup-helper-crosssdk chicken-egg-uri-common-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-alist-lib nativesdk-chicken-egg-http-client nativesdk-chicken-egg-intarweb nativesdk-chicken-egg-json nativesdk-chicken-egg-matchable nativesdk-chicken-egg-medea nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-uri-common chicken-egg-alist-lib-crosssdk chicken-egg-http-client-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-json-crosssdk chicken-egg-matchable-crosssdk chicken-egg-medea-crosssdk chicken-egg-setup-helper-crosssdk chicken-egg-uri-common-crosssdk"
DEPENDS = " chicken-egg-alist-lib chicken-egg-http-client chicken-egg-intarweb chicken-egg-json chicken-egg-matchable chicken-egg-medea chicken-egg-setup-helper chicken-egg-uri-common chicken-egg-alist-lib-cross chicken-egg-http-client-cross chicken-egg-intarweb-cross chicken-egg-json-cross chicken-egg-matchable-cross chicken-egg-medea-cross chicken-egg-setup-helper-cross chicken-egg-uri-common-cross"
RDEPENDS_${PN} = " chicken-egg-alist-lib chicken-egg-http-client chicken-egg-intarweb chicken-egg-json chicken-egg-matchable chicken-egg-medea chicken-egg-setup-helper chicken-egg-uri-common"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/neo4j/neo4j-${PV}.tar.gz"

SRC_URI[md5sum] = "60f91019ce4df5e30d23c557aee4e0dc"
SRC_URI[sha256sum] = "df825c67c59309f1cf6c819a7ed0bac977bbe5ea96f42d6074cf12ea783c1eb3"

S = "${WORKDIR}/neo4j-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
