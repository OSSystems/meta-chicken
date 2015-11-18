SECTION = "devel/chicken"
DESCRIPTION = "Some simple randomness tests for a sequence of numbers."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://random-test.meta;md5=84e0adaa30215197ec38036c29ed5f40"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/random-test/random-test-${PV}.tar.gz"

SRC_URI[md5sum] = "120b2ee2c354929fb0cbe581c2ac8d8f"
SRC_URI[sha256sum] = "051cf75e49ed7aa91177f8ae9d36c829b0f3d70e4a7473cceb81348692f4a958"

S = "${WORKDIR}/random-test-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
