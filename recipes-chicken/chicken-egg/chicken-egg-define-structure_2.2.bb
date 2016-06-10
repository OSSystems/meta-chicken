SECTION = "devel/chicken"
DESCRIPTION = "QobiScheme-compatible define-structure"
LICENSE = "LGPLv2+"
LIC_FILES_CHKSUM = "file://define-structure.meta;md5=4ab4f977773cd6c459a2d5c4d5916cc8"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-check-errors-cross chicken-egg-condition-utils-cross chicken-egg-nondeterminism-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-condition-utils-crosssdk chicken-egg-nondeterminism-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-check-errors nativesdk-chicken-egg-condition-utils nativesdk-chicken-egg-nondeterminism chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-condition-utils-crosssdk chicken-egg-nondeterminism-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-check-errors chicken-egg-condition-utils chicken-egg-nondeterminism chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-check-errors-cross chicken-egg-condition-utils-cross chicken-egg-nondeterminism-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-check-errors chicken-egg-condition-utils chicken-egg-nondeterminism"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/define-structure/define-structure-${PV}.tar.gz"

SRC_URI[md5sum] = "642578d5c968cb159e8bb8c1667826a3"
SRC_URI[sha256sum] = "35b55d51be65db6731dfb92de6abc8cc0c6881c8ad99866e18a0d9988824d7d6"

S = "${WORKDIR}/define-structure-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
