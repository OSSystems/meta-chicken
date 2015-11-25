SECTION = "devel/chicken"
DESCRIPTION = "Localization"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-29.meta;md5=80800fd1d6b6b855e488507fd85e2f4d"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-variable-item-cross chicken-egg-posix-utils-cross chicken-egg-lookup-table-cross chicken-egg-locale-cross chicken-egg-check-errors-cross chicken-egg-condition-utils-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-variable-item-crosssdk chicken-egg-posix-utils-crosssdk chicken-egg-lookup-table-crosssdk chicken-egg-locale-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-condition-utils-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-variable-item nativesdk-chicken-egg-posix-utils nativesdk-chicken-egg-lookup-table nativesdk-chicken-egg-locale nativesdk-chicken-egg-check-errors nativesdk-chicken-egg-condition-utils chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-variable-item-crosssdk chicken-egg-posix-utils-crosssdk chicken-egg-lookup-table-crosssdk chicken-egg-locale-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-condition-utils-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-variable-item chicken-egg-posix-utils chicken-egg-lookup-table chicken-egg-locale chicken-egg-check-errors chicken-egg-condition-utils chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-variable-item-cross chicken-egg-posix-utils-cross chicken-egg-lookup-table-cross chicken-egg-locale-cross chicken-egg-check-errors-cross chicken-egg-condition-utils-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-variable-item chicken-egg-posix-utils chicken-egg-lookup-table chicken-egg-locale chicken-egg-check-errors chicken-egg-condition-utils"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-29/srfi-29-${PV}.tar.gz"

SRC_URI[md5sum] = "c1fa5f998856bd7b99383c7643c18ffd"
SRC_URI[sha256sum] = "45d9b26d2f5c380abf86c88c17e797dd3bad1465b2f80a225bd21a8480027a20"

S = "${WORKDIR}/srfi-29-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
