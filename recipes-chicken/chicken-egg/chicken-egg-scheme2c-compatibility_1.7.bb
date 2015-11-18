SECTION = "devel/chicken"
DESCRIPTION = "Scheme->c compatibility package"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://scheme2c-compatibility.meta;md5=a4f56fbf26ec19a7d27781ad52bce4b8"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-check-errors-cross chicken-egg-condition-utils-cross chicken-egg-foreigners-cross chicken-egg-xlib-cross chicken-egg-traversal-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-condition-utils-crosssdk chicken-egg-foreigners-crosssdk chicken-egg-xlib-crosssdk chicken-egg-traversal-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-check-errors nativesdk-chicken-egg-condition-utils nativesdk-chicken-egg-foreigners nativesdk-chicken-egg-xlib nativesdk-chicken-egg-traversal chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-condition-utils-crosssdk chicken-egg-foreigners-crosssdk chicken-egg-xlib-crosssdk chicken-egg-traversal-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-check-errors chicken-egg-condition-utils chicken-egg-foreigners chicken-egg-xlib chicken-egg-traversal chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-check-errors-cross chicken-egg-condition-utils-cross chicken-egg-foreigners-cross chicken-egg-xlib-cross chicken-egg-traversal-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-check-errors chicken-egg-condition-utils chicken-egg-foreigners chicken-egg-xlib chicken-egg-traversal"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/scheme2c-compatibility/scheme2c-compatibility-${PV}.tar.gz"

SRC_URI[md5sum] = "c39dc00895a093a0af913bf48923984f"
SRC_URI[sha256sum] = "e9636327858d707b79ecb6dde6b8db7a90ec8cbbfe82d08046d62f8792aa47dd"

S = "${WORKDIR}/scheme2c-compatibility-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
