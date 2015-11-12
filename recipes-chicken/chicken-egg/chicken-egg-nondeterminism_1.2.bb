SECTION = "devel/chicken"
DESCRIPTION = "Nondeterministic computations"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://nondeterminism.meta;md5=a4d52ac7b1bae8ee13365d184103896f"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-check-errors-cross chicken-egg-condition-utils-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-condition-utils-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-check-errors nativesdk-chicken-egg-condition-utils chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-condition-utils-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-check-errors chicken-egg-condition-utils chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-check-errors-cross chicken-egg-condition-utils-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-check-errors chicken-egg-condition-utils"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/nondeterminism/nondeterminism-${PV}.tar.gz"

SRC_URI[md5sum] = "8eaef0c68c13cc2d04c2b0512c3f572c"
SRC_URI[sha256sum] = "0cdbc7644bb5727f68025cf0c88870306a7d7db8aed03302f7fa925fbf57a233"

S = "${WORKDIR}/nondeterminism-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
