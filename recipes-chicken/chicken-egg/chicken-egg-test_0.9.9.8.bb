SECTION = "devel/chicken"
DESCRIPTION = "Yet Another Testing Utility"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://test.meta;md5=9d6f9e6becd92deb67b66ef401adf626"
DEPENDS_virtclass-cross += "chicken-egg-regex-cross"
DEPENDS += "chicken-egg-regex chicken-egg-regex-cross"
RDEPENDS_${PN} += "chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "08c58d021959a599704bdb70723c71ef"
SRC_URI[sha256sum] = "c7f5025dc166ff69074b1be005147e105173f2cc00753118c30d62901713d2ff"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
