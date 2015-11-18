SECTION = "devel/chicken"
DESCRIPTION = "A set of functions to manage pools in a thread-safe manner"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://pool.meta;md5=f641b9534b3e7948488259bf35b5ec62"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/pool/pool-${PV}.tar.gz"

SRC_URI[md5sum] = "f32621b3c7c3ca47f8166cbfb97b5773"
SRC_URI[sha256sum] = "019224e92ef3abd8347b7c56223d1062a94c96c72597207af59a22e2262dc6e8"

S = "${WORKDIR}/pool-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
