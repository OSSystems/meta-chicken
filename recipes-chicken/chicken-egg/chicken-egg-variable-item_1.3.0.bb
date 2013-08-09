SECTION = "devel/chicken"
DESCRIPTION = "variable-item"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://variable-item.meta;md5=ccab3eca8a46f767e1fc4d3c058a1261"
DEPENDS_virtclass-cross += "chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
DEPENDS += "chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
RDEPENDS_${PN} += "chicken-egg-setup-helper chicken-egg-check-errors"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "e132e8d4d02ea91fe5811d76d71871c0"
SRC_URI[sha256sum] = "edda041ea21e3d3853f2fac1631439b92ca608a645f34eb2ebd304b6ef76a33c"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
