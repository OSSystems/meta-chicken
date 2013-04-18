SECTION = "devel/chicken"
DESCRIPTION = "Read & write INI configuration files"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://ini-file.meta;md5=83234ecc91328b5adcb0dc8dc607c1e8"
DEPENDS_virtclass-cross += "chicken-egg-regex-cross"
DEPENDS += "chicken-egg-regex chicken-egg-regex-cross"
RDEPENDS_${PN} += "chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "608de0e80fd3ef740aadd5edfbd0e3bc"
SRC_URI[sha256sum] = "0a909427c96db9e408818e517c816710b22320b4b2dc7a913a14db1de97cad5f"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
