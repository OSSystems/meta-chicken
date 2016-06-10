SECTION = "devel/chicken"
DESCRIPTION = "Basic linear algebra: vectors, matrices, and sparse matrices along with related operations"
LICENSE = "LGPLv2+"
LIC_FILES_CHKSUM = "file://linear-algebra.meta;md5=99d646068f6d5a0d8ecfcf36fda59f55"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-check-errors-cross chicken-egg-condition-utils-cross chicken-egg-traversal-cross chicken-egg-ad-cross chicken-egg-define-structure-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-condition-utils-crosssdk chicken-egg-traversal-crosssdk chicken-egg-ad-crosssdk chicken-egg-define-structure-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-check-errors nativesdk-chicken-egg-condition-utils nativesdk-chicken-egg-traversal nativesdk-chicken-egg-ad nativesdk-chicken-egg-define-structure chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-condition-utils-crosssdk chicken-egg-traversal-crosssdk chicken-egg-ad-crosssdk chicken-egg-define-structure-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-check-errors chicken-egg-condition-utils chicken-egg-traversal chicken-egg-ad chicken-egg-define-structure chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-check-errors-cross chicken-egg-condition-utils-cross chicken-egg-traversal-cross chicken-egg-ad-cross chicken-egg-define-structure-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-check-errors chicken-egg-condition-utils chicken-egg-traversal chicken-egg-ad chicken-egg-define-structure"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/linear-algebra/linear-algebra-${PV}.tar.gz"

SRC_URI[md5sum] = "75b29a825e049d2112066624c1b73eda"
SRC_URI[sha256sum] = "c8d54d8d25a49a7f059f09e33df30052c901fb3a89d75566586e59d3664d0443"

S = "${WORKDIR}/linear-algebra-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
