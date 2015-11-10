SECTION = "devel/chicken"
DESCRIPTION = "String Utilities"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://string-utils.meta;md5=fc33a5ce982e9299d15d91d0e76df450"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-lookup-table-cross chicken-egg-check-errors-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-lookup-table-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-lookup-table nativesdk-chicken-egg-check-errors chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-lookup-table-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-lookup-table chicken-egg-check-errors chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-lookup-table-cross chicken-egg-check-errors-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-lookup-table chicken-egg-check-errors"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/string-utils/string-utils-${PV}.tar.gz"

SRC_URI[md5sum] = "f33dd604d995cd1ac68322b9596c0e03"
SRC_URI[sha256sum] = "4347d2d044e18386ffab25f2bcf6d88d6fb8942a60d8ea96d4d261ff19058fc9"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
