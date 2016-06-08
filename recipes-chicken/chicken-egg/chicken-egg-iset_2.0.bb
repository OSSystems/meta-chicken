SECTION = "devel/chicken"
DESCRIPTION = "Integer sets"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://iset.meta;md5=a59c0385ec4ebde61870d7394ae6d3bb"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/iset/iset-${PV}.tar.gz"

SRC_URI[md5sum] = "2ed437a959fff195abc31cf272562292"
SRC_URI[sha256sum] = "6857f1857207524cf68638b1bbc755a80fa22086f4f1467d33c2a03bdebbec34"

S = "${WORKDIR}/iset-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
