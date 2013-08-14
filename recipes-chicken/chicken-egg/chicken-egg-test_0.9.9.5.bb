SECTION = "devel/chicken"
DESCRIPTION = "Yet Another Testing Utility"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://test.meta;md5=9d6f9e6becd92deb67b66ef401adf626"
DEPENDS_virtclass-cross += "chicken-egg-regex-cross"
DEPENDS += "chicken-egg-regex chicken-egg-regex-cross"
RDEPENDS_${PN} += "chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "f61353b6d7467b2d510c0eddd09fa3cc"
SRC_URI[sha256sum] = "076095335ec559dd156280efb5d4132282dcfa6e111913657dca189ddcc0a3f0"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
