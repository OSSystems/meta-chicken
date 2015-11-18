SECTION = "devel/chicken"
DESCRIPTION = "symbol-utils"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://symbol-utils.meta;md5=473c192ae55fced0671c5ccbfd01ddda"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-check-errors chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-check-errors"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/symbol-utils/symbol-utils-${PV}.tar.gz"

SRC_URI[md5sum] = "5f507d008aafba9caaeb2a3c60136c49"
SRC_URI[sha256sum] = "14f828e923e02a0c5bfb4940a8c2832cb0b73031f464132e69fff195231fe1f0"

S = "${WORKDIR}/symbol-utils-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
