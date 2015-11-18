SECTION = "devel/chicken"
DESCRIPTION = "Some simple testing routines"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://simple-tests.meta;md5=551e96e1543e810c3aaa4bb49170f72d"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/simple-tests/simple-tests-${PV}.tar.gz"

SRC_URI[md5sum] = "ebf853b29fa125daf10f7090273bf1cf"
SRC_URI[sha256sum] = "fa05b57ef6d575fd3ef64a53fe6c48e9d64b597e694732bfb3530658cd4fa032"

S = "${WORKDIR}/simple-tests-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
