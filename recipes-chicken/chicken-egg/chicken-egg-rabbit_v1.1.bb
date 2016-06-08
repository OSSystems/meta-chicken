SECTION = "devel/chicken"
DESCRIPTION = "Rabbit stream cipher"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://rabbit.meta;md5=6c5d3f08a1d208b396b465b428c3393e"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/rabbit/rabbit-${PV}.tar.gz"

SRC_URI[md5sum] = "4362a4dfcf39c1b6f8fe5f4d33fe92ac"
SRC_URI[sha256sum] = "6c381a233ccf04d9f0e2b727720b3402cb985a805b9a633c3a4fa2ba8be6a499"

S = "${WORKDIR}/rabbit-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
