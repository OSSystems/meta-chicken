SECTION = "devel/chicken"
DESCRIPTION = "Levenshtein edit distance"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://levenshtein.meta;md5=e18714b0e671a02ade3351c825e4fc9a"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-check-errors-cross chicken-egg-vector-lib-cross chicken-egg-srfi-63-cross chicken-egg-utf8-cross chicken-egg-numbers-cross chicken-egg-miscmacros-cross chicken-egg-moremacros-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-vector-lib-crosssdk chicken-egg-srfi-63-crosssdk chicken-egg-utf8-crosssdk chicken-egg-numbers-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-moremacros-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-check-errors nativesdk-chicken-egg-vector-lib nativesdk-chicken-egg-srfi-63 nativesdk-chicken-egg-utf8 nativesdk-chicken-egg-numbers nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-moremacros chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-vector-lib-crosssdk chicken-egg-srfi-63-crosssdk chicken-egg-utf8-crosssdk chicken-egg-numbers-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-moremacros-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-vector-lib chicken-egg-srfi-63 chicken-egg-utf8 chicken-egg-numbers chicken-egg-miscmacros chicken-egg-moremacros chicken-egg-setup-helper-cross chicken-egg-check-errors-cross chicken-egg-vector-lib-cross chicken-egg-srfi-63-cross chicken-egg-utf8-cross chicken-egg-numbers-cross chicken-egg-miscmacros-cross chicken-egg-moremacros-cross chicken-egg-levenshtein-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-vector-lib chicken-egg-srfi-63 chicken-egg-utf8 chicken-egg-numbers chicken-egg-miscmacros chicken-egg-moremacros"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/levenshtein/levenshtein-${PV}.tar.gz"

SRC_URI[md5sum] = "d4bd08239f65ce0948cd2646b3375c8c"
SRC_URI[sha256sum] = "39a5d010296124451bc90d8af03f19ee6c1b59e85b284af9c9968d006d0476b8"

S = "${WORKDIR}/levenshtein-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
