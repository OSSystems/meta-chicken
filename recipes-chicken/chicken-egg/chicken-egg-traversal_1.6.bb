SECTION = "devel/chicken"
DESCRIPTION = "Various list operations"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://traversal.meta;md5=af27e17a25ef052a8820da50a85ba8a8"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-check-errors-cross chicken-egg-condition-utils-cross chicken-egg-vector-lib-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-condition-utils-crosssdk chicken-egg-vector-lib-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-check-errors nativesdk-chicken-egg-condition-utils nativesdk-chicken-egg-vector-lib chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-condition-utils-crosssdk chicken-egg-vector-lib-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-check-errors chicken-egg-condition-utils chicken-egg-vector-lib chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-check-errors-cross chicken-egg-condition-utils-cross chicken-egg-vector-lib-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-check-errors chicken-egg-condition-utils chicken-egg-vector-lib"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/traversal/traversal-${PV}.tar.gz"

SRC_URI[md5sum] = "0f198e40e4d1c3a422051e0825e58d0d"
SRC_URI[sha256sum] = "e6c1b8f53393c9bc4897d1c34c4dcf88f2a22cba39ba84a6ebcb80fff6b350e6"

S = "${WORKDIR}/traversal-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
