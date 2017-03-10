SECTION = "devel/chicken"
DESCRIPTION = "Some user-friendly exception routines"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://simple-exceptions.meta;md5=b809180900b6acf12dc3f2ed6391a297"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/simple-exceptions/simple-exceptions-${PV}.tar.gz"

SRC_URI[md5sum] = "6722f1c3cf69545613a7196323077c3c"
SRC_URI[sha256sum] = "5d35a5cb0cf4d8d4410df85cbfe51997ac173767d12f3462ed736b795f154e80"

S = "${WORKDIR}/simple-exceptions-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
