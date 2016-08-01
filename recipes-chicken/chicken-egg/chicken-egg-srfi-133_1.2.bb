SECTION = "devel/chicken"
DESCRIPTION = "SRFI-133: Vector Library (R7RS-compatible)"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-133.meta;md5=48f0c13689e5050c79d295f308f9763c"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-133/srfi-133-${PV}.tar.gz"

SRC_URI[md5sum] = "cc1c12e932ff0d26bb325f6958290d50"
SRC_URI[sha256sum] = "7376bc5f873b6f447f7775d18b9adacbebfb7cdb0cd6a1c941650a0d2f66cb94"

S = "${WORKDIR}/srfi-133-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
