SECTION = "devel/chicken"
DESCRIPTION = "Core interface to Mediawiki API"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://mw-core.meta;md5=e51d805fd2bc9d126f257220614bab79"
DEPENDS_append_class-cross = " chicken-egg-uri-common-cross chicken-egg-intarweb-cross chicken-egg-http-client-cross chicken-egg-z3-cross chicken-egg-ssax-cross chicken-egg-sxpath-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-uri-common-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-http-client-crosssdk chicken-egg-z3-crosssdk chicken-egg-ssax-crosssdk chicken-egg-sxpath-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-intarweb nativesdk-chicken-egg-http-client nativesdk-chicken-egg-z3 nativesdk-chicken-egg-ssax nativesdk-chicken-egg-sxpath chicken-egg-uri-common-crosssdk chicken-egg-intarweb-crosssdk chicken-egg-http-client-crosssdk chicken-egg-z3-crosssdk chicken-egg-ssax-crosssdk chicken-egg-sxpath-crosssdk"
DEPENDS = " chicken-egg-uri-common chicken-egg-intarweb chicken-egg-http-client chicken-egg-z3 chicken-egg-ssax chicken-egg-sxpath chicken-egg-uri-common-cross chicken-egg-intarweb-cross chicken-egg-http-client-cross chicken-egg-z3-cross chicken-egg-ssax-cross chicken-egg-sxpath-cross chicken-egg-mw-core-cross"
RDEPENDS_${PN} = " chicken-egg-uri-common chicken-egg-intarweb chicken-egg-http-client chicken-egg-z3 chicken-egg-ssax chicken-egg-sxpath"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/mw-core/mw-core-${PV}.tar.gz"

SRC_URI[md5sum] = "cf6270ab3108c8b7ad71403bf38dba52"
SRC_URI[sha256sum] = "446690ae9e6dc28af1add977197623ead2302408e89f980dc4e08a6797748a65"

S = "${WORKDIR}/mw-core-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
