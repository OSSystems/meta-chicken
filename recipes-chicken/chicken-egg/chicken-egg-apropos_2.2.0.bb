SECTION = "devel/chicken"
DESCRIPTION = "Chicken apropos"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://apropos.meta;md5=a81f66c5d28a2e69fe886d2ba4a1a74c"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-string-utils-cross chicken-egg-symbol-utils-cross chicken-egg-check-errors-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-string-utils-crosssdk chicken-egg-symbol-utils-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-string-utils nativesdk-chicken-egg-symbol-utils nativesdk-chicken-egg-check-errors chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-string-utils-crosssdk chicken-egg-symbol-utils-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-string-utils chicken-egg-symbol-utils chicken-egg-check-errors chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-string-utils-cross chicken-egg-symbol-utils-cross chicken-egg-check-errors-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-string-utils chicken-egg-symbol-utils chicken-egg-check-errors"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/apropos/apropos-${PV}.tar.gz"

SRC_URI[md5sum] = "a3909b2d869da3264ffb56c4a9289474"
SRC_URI[sha256sum] = "d344c5c6646509afd8b8861246279bd4adc0403d54bf0029cadd8efb65127270"

S = "${WORKDIR}/apropos-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
