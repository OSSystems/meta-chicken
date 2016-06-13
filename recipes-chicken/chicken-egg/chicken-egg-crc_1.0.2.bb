SECTION = "devel/chicken"
DESCRIPTION = "Computes CRC checksum"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://crc.meta;md5=b755905047653c3fcf95eccfe50f374e"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/crc/crc-${PV}.tar.gz"

SRC_URI[md5sum] = "5d30701b84dcb975d01056960f2a671d"
SRC_URI[sha256sum] = "94ea5a2ece1338b2bf5f241d43cfdc175cdc6841fc49f50101d0b1d25d26aec4"

S = "${WORKDIR}/crc-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
