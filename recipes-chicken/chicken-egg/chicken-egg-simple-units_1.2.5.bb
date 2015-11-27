SECTION = "devel/chicken"
DESCRIPTION = "Simple Units"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://simple-units.meta;md5=044ca4c273e11b8b5a82fa79d891adcd"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-check-errors-cross chicken-egg-record-variants-cross chicken-egg-list-utils-cross chicken-egg-symbol-utils-cross chicken-egg-lookup-table-cross chicken-egg-moremacros-cross chicken-egg-variable-item-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-record-variants-crosssdk chicken-egg-list-utils-crosssdk chicken-egg-symbol-utils-crosssdk chicken-egg-lookup-table-crosssdk chicken-egg-moremacros-crosssdk chicken-egg-variable-item-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-check-errors nativesdk-chicken-egg-record-variants nativesdk-chicken-egg-list-utils nativesdk-chicken-egg-symbol-utils nativesdk-chicken-egg-lookup-table nativesdk-chicken-egg-moremacros nativesdk-chicken-egg-variable-item chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-record-variants-crosssdk chicken-egg-list-utils-crosssdk chicken-egg-symbol-utils-crosssdk chicken-egg-lookup-table-crosssdk chicken-egg-moremacros-crosssdk chicken-egg-variable-item-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-record-variants chicken-egg-list-utils chicken-egg-symbol-utils chicken-egg-lookup-table chicken-egg-moremacros chicken-egg-variable-item chicken-egg-setup-helper-cross chicken-egg-check-errors-cross chicken-egg-record-variants-cross chicken-egg-list-utils-cross chicken-egg-symbol-utils-cross chicken-egg-lookup-table-cross chicken-egg-moremacros-cross chicken-egg-variable-item-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-record-variants chicken-egg-list-utils chicken-egg-symbol-utils chicken-egg-lookup-table chicken-egg-moremacros chicken-egg-variable-item"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/simple-units/simple-units-${PV}.tar.gz"

SRC_URI[md5sum] = "9926c38209a8423bfd6d5a7e796733fc"
SRC_URI[sha256sum] = "297662224a8acf41cb8754003ca17f7c78e1adde4411d55b4a9f28c663077cdd"

S = "${WORKDIR}/simple-units-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
