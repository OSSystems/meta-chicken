SECTION = "devel/chicken"
DESCRIPTION = "list-utils"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://list-utils.meta;md5=5a61b95a676e7877e1e4e272fd164a67"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-check-errors chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-check-errors"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/list-utils/list-utils-${PV}.tar.gz"

SRC_URI[md5sum] = "9fce58555324165fdf849f052498223c"
SRC_URI[sha256sum] = "2be8c2476fa96f357fa970fd0088314032af16ea02d5a14f2ed24d1fb13f037d"

S = "${WORKDIR}/list-utils-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
