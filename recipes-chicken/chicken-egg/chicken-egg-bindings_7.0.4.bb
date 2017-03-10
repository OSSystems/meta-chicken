SECTION = "devel/chicken"
DESCRIPTION = "Pattern matching with destructuring bindings"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://bindings.meta;md5=01bfabea93dc8cd69919a8ce1d9593b8"
DEPENDS_append_class-cross = " chicken-egg-simple-exceptions-cross chicken-egg-basic-sequences-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-simple-exceptions-crosssdk chicken-egg-basic-sequences-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-simple-exceptions nativesdk-chicken-egg-basic-sequences chicken-egg-simple-exceptions-crosssdk chicken-egg-basic-sequences-crosssdk"
DEPENDS = " chicken-egg-simple-exceptions chicken-egg-basic-sequences chicken-egg-simple-exceptions-cross chicken-egg-basic-sequences-cross chicken-egg-bindings-cross"
RDEPENDS_${PN} = " chicken-egg-simple-exceptions chicken-egg-basic-sequences"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/bindings/bindings-${PV}.tar.gz"

SRC_URI[md5sum] = "f8a13da80eef7b3715a5342a003cb802"
SRC_URI[sha256sum] = "ecade53fc0f685695bb86bd020e52e82f4e82524955ad299966996c8885873e6"

S = "${WORKDIR}/bindings-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
