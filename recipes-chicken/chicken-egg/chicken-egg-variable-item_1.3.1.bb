SECTION = "devel/chicken"
DESCRIPTION = "variable-item"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://variable-item.meta;md5=32068b2881844817da9cf1ec42caf28c"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-check-errors chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-check-errors"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/variable-item/variable-item-${PV}.tar.gz"

SRC_URI[md5sum] = "68eb2d8dbb6c04f0aae4906f1fb23204"
SRC_URI[sha256sum] = "209e4903e94196979ca248184e1171d034d9c515c85719eaa66b1d249fb1af21"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
