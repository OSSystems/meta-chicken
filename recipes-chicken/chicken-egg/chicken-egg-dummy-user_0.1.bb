SECTION = "devel/chicken"
DESCRIPTION = "Simulates user input for testing interactive command-line applications."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://dummy-user.meta;md5=1e603edff778bc4aaf9079f51333200f"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/dummy-user/dummy-user-${PV}.tar.gz"

SRC_URI[md5sum] = "b6e6ec1de2d2b904f00ed448f675a6df"
SRC_URI[sha256sum] = "5667510eaafbcf638cee758f50e85ef6304bebd43e93fb31e26e7e0da7d1b743"

S = "${WORKDIR}/dummy-user-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
