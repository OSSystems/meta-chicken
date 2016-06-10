SECTION = "devel/chicken"
DESCRIPTION = "Solve constraint satisfaction problems"
LICENSE = "LGPLv2+"
LIC_FILES_CHKSUM = "file://csp.meta;md5=e10643dac35cc891f902803a3861d330"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-check-errors-cross chicken-egg-condition-utils-cross chicken-egg-traversal-cross chicken-egg-nondeterminism-cross chicken-egg-define-structure-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-condition-utils-crosssdk chicken-egg-traversal-crosssdk chicken-egg-nondeterminism-crosssdk chicken-egg-define-structure-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-check-errors nativesdk-chicken-egg-condition-utils nativesdk-chicken-egg-traversal nativesdk-chicken-egg-nondeterminism nativesdk-chicken-egg-define-structure chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-condition-utils-crosssdk chicken-egg-traversal-crosssdk chicken-egg-nondeterminism-crosssdk chicken-egg-define-structure-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-check-errors chicken-egg-condition-utils chicken-egg-traversal chicken-egg-nondeterminism chicken-egg-define-structure chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-check-errors-cross chicken-egg-condition-utils-cross chicken-egg-traversal-cross chicken-egg-nondeterminism-cross chicken-egg-define-structure-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-check-errors chicken-egg-condition-utils chicken-egg-traversal chicken-egg-nondeterminism chicken-egg-define-structure"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/csp/csp-${PV}.tar.gz"

SRC_URI[md5sum] = "ae560fe3e0943e09e4de7999ca430dfb"
SRC_URI[sha256sum] = "f8b590a05f28dc1ceff327e1df26929cd36d2fd10347c6397611c9afdf2c594f"

S = "${WORKDIR}/csp-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
