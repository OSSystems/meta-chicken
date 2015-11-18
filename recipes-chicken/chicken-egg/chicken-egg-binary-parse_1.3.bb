SECTION = "devel/chicken"
DESCRIPTION = "Reading variable number of bits from a sequential input stream"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://binary-parse.meta;md5=07c6d84ab7672922124248a2c8e6d39c"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/binary-parse/binary-parse-${PV}.tar.gz"

SRC_URI[md5sum] = "13b95ccb31e2c5b8724fcbf92eb67d34"
SRC_URI[sha256sum] = "2eb36f4fbf36cd53f8495d28c54a0850dd9c0b617cd845534e843894326745cc"

S = "${WORKDIR}/binary-parse-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
