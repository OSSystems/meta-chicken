SECTION = "devel/chicken"
DESCRIPTION = "A wrapper around the LZ4 compression library."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://lz4.meta;md5=4a85f8017a8c832d691fb272b415828b"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/lz4/lz4-${PV}.tar.gz"

SRC_URI[md5sum] = "11acc06ade2a0e207c2e9b19d5314bee"
SRC_URI[sha256sum] = "e40172f12a210e93b1114572e185ce72dd2ceeed67751527290c55488cab9b5c"

S = "${WORKDIR}/lz4-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
