SECTION = "devel/chicken"
DESCRIPTION = "Typed variants of various record-definition macros"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://typed-records.meta;md5=71611f6aed4e10f948f9a9e64957bf71"
DEPENDS_append_class-cross = " chicken-egg-defstruct-cross chicken-egg-type-stubs-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-defstruct-crosssdk chicken-egg-type-stubs-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-defstruct nativesdk-chicken-egg-type-stubs chicken-egg-defstruct-crosssdk chicken-egg-type-stubs-crosssdk"
DEPENDS = " chicken-egg-defstruct chicken-egg-type-stubs chicken-egg-defstruct-cross chicken-egg-type-stubs-cross"
RDEPENDS_${PN} = " chicken-egg-defstruct chicken-egg-type-stubs"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/typed-records/typed-records-${PV}.tar.gz"

SRC_URI[md5sum] = "e8d1ff98139faf04e0bc43939893e0aa"
SRC_URI[sha256sum] = "252cd15114128f682aac2f29005071fa42c188c4166660be1fb0b4c074d40e05"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
