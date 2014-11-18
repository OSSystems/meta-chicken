SECTION = "devel/chicken"
DESCRIPTION = "Read & write INI configuration files"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://ini-file.meta;md5=83234ecc91328b5adcb0dc8dc607c1e8"
DEPENDS_virtclass-cross += "chicken-egg-regex-cross"
DEPENDS += "chicken-egg-regex chicken-egg-regex-cross"
RDEPENDS_${PN} += "chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "29d6bb2701e240c088bbe0237fb43555"
SRC_URI[sha256sum] = "208dea9092bae97bcc59500754324e2521c370749f11f21c3bf4c2f4468b8793"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
