SECTION = "devel/chicken"
DESCRIPTION = "Provides locale operations"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://locale.meta;md5=05a5c87f76bd51957bccb5caa617d39c"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-lookup-table-cross chicken-egg-check-errors-cross chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-lookup-table-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-lookup-table nativesdk-chicken-egg-check-errors nativesdk-chicken-egg-regex chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-lookup-table-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-lookup-table chicken-egg-check-errors chicken-egg-regex chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-lookup-table-cross chicken-egg-check-errors-cross chicken-egg-regex-cross chicken-egg-locale-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-lookup-table chicken-egg-check-errors chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/locale/locale-${PV}.tar.gz"

SRC_URI[md5sum] = "10a7e7087386e9465682bcfce357504e"
SRC_URI[sha256sum] = "4315879f9340600890feaacaaccfe34b52df5105b15af06d0f36a40e17f5088f"

S = "${WORKDIR}/locale-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
