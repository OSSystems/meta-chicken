SECTION = "devel/chicken"
DESCRIPTION = "A tool for testing eggs"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://salmonella.meta;md5=1297d122d63a9e2fcc11245efb14a04b"
DEPENDS = " chicken-egg-salmonella-cross"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/salmonella/salmonella-${PV}.tar.gz"

SRC_URI[md5sum] = "7dec9553d01a797b57a884a00bb393f9"
SRC_URI[sha256sum] = "1cebac83ee17572c38fe1068b8032ad611330a8e6ce2c772f963463e2c9d107e"

S = "${WORKDIR}/salmonella-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
