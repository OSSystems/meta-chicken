SECTION = "devel/chicken"
DESCRIPTION = "SRFI-99 record types"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-99.meta;md5=a9319bc455905331cb6dc21a03533b45"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-99/srfi-99-${PV}.tar.gz"

SRC_URI[md5sum] = "544b866dac8d6deb4d12f0f28d5396c5"
SRC_URI[sha256sum] = "b769c07334a95d665cc3ef446cf39ef25f560d1de4d2bf4088a367fd588f32fe"

S = "${WORKDIR}/srfi-99-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
