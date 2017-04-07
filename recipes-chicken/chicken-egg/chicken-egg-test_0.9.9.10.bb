SECTION = "devel/chicken"
DESCRIPTION = "Yet Another Testing Utility"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://test.meta;md5=0633dae6ac8e7d1982c81f08b0abcd51"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/test/test-${PV}.tar.gz"

SRC_URI[md5sum] = "9b389368c0bdd8b2c7e6df9c4973de1a"
SRC_URI[sha256sum] = "4eede2235c811fa3976e03fad971e72a9d974776b29a40dc0292cbe42057c4ab"

S = "${WORKDIR}/test-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
