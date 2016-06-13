SECTION = "devel/chicken"
DESCRIPTION = "Expanded Mediawiki API interface"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://mw.meta;md5=8dec80459772d55fc8b56db21cfd2c93"
DEPENDS_append_class-cross = " chicken-egg-uri-common-cross chicken-egg-intarweb-cross chicken-egg-http-client-cross chicken-egg-z3-cross chicken-egg-ssax-cross chicken-egg-sxpath-cross chicken-egg-mw-core-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-uri-common-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-http-client-crosssdk chicken-egg-z3-crosssdk chicken-egg-ssax-crosssdk chicken-egg-sxpath-crosssdk chicken-egg-mw-core-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-intarweb nativesdk-chicken-egg-http-client nativesdk-chicken-egg-z3 nativesdk-chicken-egg-ssax nativesdk-chicken-egg-sxpath nativesdk-chicken-egg-mw-core chicken-egg-uri-common-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-http-client-crosssdk chicken-egg-z3-crosssdk chicken-egg-ssax-crosssdk chicken-egg-sxpath-crosssdk chicken-egg-mw-core-crosssdk"
DEPENDS = " chicken-egg-uri-common chicken-egg-intarweb chicken-egg-http-client chicken-egg-z3 chicken-egg-ssax chicken-egg-sxpath chicken-egg-mw-core chicken-egg-uri-common-cross chicken-egg-intarweb-cross chicken-egg-http-client-cross chicken-egg-z3-cross chicken-egg-ssax-cross chicken-egg-sxpath-cross chicken-egg-mw-core-cross chicken-egg-mw-cross"
RDEPENDS_${PN} = " chicken-egg-uri-common chicken-egg-intarweb chicken-egg-http-client chicken-egg-z3 chicken-egg-ssax chicken-egg-sxpath chicken-egg-mw-core"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/mw/mw-${PV}.tar.gz"

SRC_URI[md5sum] = "bfce7322663f70e057b25bb71a2b4451"
SRC_URI[sha256sum] = "f8f537ed798aee08adba14f928174f612c0537d33997080d2587bbeb77cd0232"

S = "${WORKDIR}/mw-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
