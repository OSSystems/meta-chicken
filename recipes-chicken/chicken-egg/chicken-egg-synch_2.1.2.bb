SECTION = "devel/chicken"
DESCRIPTION = "Synchronization Forms"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://synch.meta;md5=97b3faf0fcdc0f4ef9cd1fd2a1ae58af"
DEPENDS_virtclass-cross += "chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
DEPENDS += "chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
RDEPENDS_${PN} += "chicken-egg-setup-helper chicken-egg-check-errors"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "b7ffcdeebb0cc055bd023954882ecafc"
SRC_URI[sha256sum] = "2febc6aefae15b804cb677d07983497c4b00dfe695b47b8d14c96e4a0dab21fe"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
