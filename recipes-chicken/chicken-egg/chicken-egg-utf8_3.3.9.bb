SECTION = "devel/chicken"
DESCRIPTION = "Unicode support"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://utf8.meta;md5=45274b381c867bf201417f8b15b274ce"
DEPENDS_append_class-cross = " chicken-egg-iset-cross chicken-egg-regex-cross chicken-egg-make-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-iset-crosssdk chicken-egg-regex-crosssdk chicken-egg-make-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-iset nativesdk-chicken-egg-regex nativesdk-chicken-egg-make chicken-egg-iset-crosssdk chicken-egg-regex-crosssdk chicken-egg-make-crosssdk"
DEPENDS = " chicken-egg-iset chicken-egg-regex chicken-egg-make chicken-egg-iset-cross chicken-egg-regex-cross chicken-egg-make-cross chicken-egg-utf8-cross"
RDEPENDS_${PN} = " chicken-egg-iset chicken-egg-regex chicken-egg-make"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "1c95284ff7d6d003f28c220cf2b98b92"
SRC_URI[sha256sum] = "1ce4d1b9b483cfb51345b043a7c8e9e63f277673713d3c66e482f39469b9f857"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
