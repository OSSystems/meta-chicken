SECTION = "devel/chicken"
DESCRIPTION = "Computes CRC checksum"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://crc.meta;md5=f74b8f37bf8cf639af3da0e8a7ffb453"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/crc/crc-${PV}.tar.gz"

SRC_URI[md5sum] = "497cdaa12351a8e90155f0f5463f61a6"
SRC_URI[sha256sum] = "d41693d9ab90771432cdffee065add9f02ea27ccbd4720de914331580ef35ce8"

S = "${WORKDIR}/crc-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
