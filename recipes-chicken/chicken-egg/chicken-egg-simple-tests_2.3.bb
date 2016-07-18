SECTION = "devel/chicken"
DESCRIPTION = "Some simple testing routines"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://simple-tests.meta;md5=551e96e1543e810c3aaa4bb49170f72d"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/simple-tests/simple-tests-${PV}.tar.gz"

SRC_URI[md5sum] = "3a6d809888012563e44692ee1f169b68"
SRC_URI[sha256sum] = "ab37f969d875f5c3d7533cf7e197a342af29ac909df48747dcd28ef32e064808"

S = "${WORKDIR}/simple-tests-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
