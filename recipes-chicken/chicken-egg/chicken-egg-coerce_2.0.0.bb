SECTION = "devel/chicken"
DESCRIPTION = "Type Identity & Coercion"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://coerce.meta;md5=ddc6fbc59a413efdd581c353caf1e6aa"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-lookup-table-cross chicken-egg-check-errors-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-lookup-table-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-lookup-table nativesdk-chicken-egg-check-errors chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-lookup-table-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-lookup-table chicken-egg-check-errors chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-lookup-table-cross chicken-egg-check-errors-cross chicken-egg-coerce-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-lookup-table chicken-egg-check-errors"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/coerce/coerce-${PV}.tar.gz"

SRC_URI[md5sum] = "6cafb292400b8255b02e8d201f4846d6"
SRC_URI[sha256sum] = "58b11ee84e84819fe3789f53e7e1116b0ca7b283e27f89489fca9cf150cfcb8e"

S = "${WORKDIR}/coerce-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
