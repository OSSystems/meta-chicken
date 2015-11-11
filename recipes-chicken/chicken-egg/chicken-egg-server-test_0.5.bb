SECTION = "devel/chicken"
DESCRIPTION = "Utilities to help testing servers"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://server-test.meta;md5=85223759dd4e539ca85c30c1d4c257cc"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/server-test/server-test-${PV}.tar.gz"

SRC_URI[md5sum] = "b649bdf665877d60c99560527948b526"
SRC_URI[sha256sum] = "3c60f563fa4f104fb75c2d617a4d7aebb2f7f904877e5341b3e35c71181c1f23"

S = "${WORKDIR}/server-test-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
