SECTION = "devel/chicken"
DESCRIPTION = "Simple Lookup Table"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://lookup-table.meta;md5=0ad1c04615c8f2abbf72424a471aec22"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-check-errors-cross chicken-egg-miscmacros-cross chicken-egg-record-variants-cross chicken-egg-synch-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-record-variants-crosssdk chicken-egg-synch-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-check-errors nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-record-variants nativesdk-chicken-egg-synch chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-record-variants-crosssdk chicken-egg-synch-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-miscmacros chicken-egg-record-variants chicken-egg-synch chicken-egg-setup-helper-cross chicken-egg-check-errors-cross chicken-egg-miscmacros-cross chicken-egg-record-variants-cross chicken-egg-synch-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-miscmacros chicken-egg-record-variants chicken-egg-synch"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "38dbfee2dc54fa8410481990005f8878"
SRC_URI[sha256sum] = "d401e9dddf316a1ba15d0d2e25c8e42d5eb572026b13b8c04cd2ce77f54d3304"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
