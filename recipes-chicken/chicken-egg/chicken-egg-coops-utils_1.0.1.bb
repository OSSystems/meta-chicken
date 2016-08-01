SECTION = "devel/chicken"
DESCRIPTION = "coops-utils"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://coops-utils.meta;md5=c75173be8ada946ec710733818d8f5cc"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-coops-cross chicken-egg-check-errors-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-coops-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-coops nativesdk-chicken-egg-check-errors chicken-egg-setup-helper-crosssdk chicken-egg-coops-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-coops chicken-egg-check-errors chicken-egg-setup-helper-cross chicken-egg-coops-cross chicken-egg-check-errors-cross chicken-egg-coops-utils-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-coops chicken-egg-check-errors"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/coops-utils/coops-utils-${PV}.tar.gz"

SRC_URI[md5sum] = "5d0eba52b8a26e3552c6bf4354450202"
SRC_URI[sha256sum] = "3f12c90c80264ed11e7a639f8b689447fb77fb6851f6c09f05545165d03994e7"

S = "${WORKDIR}/coops-utils-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
