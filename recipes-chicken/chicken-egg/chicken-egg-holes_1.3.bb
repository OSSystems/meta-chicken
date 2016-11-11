SECTION = "devel/chicken"
DESCRIPTION = "partial expressions as procedures with named parameters"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://holes.meta;md5=f4548dfd255a14c1338082d8e7e0d63e"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/holes/holes-${PV}.tar.gz"

SRC_URI[md5sum] = "ec58d6317fae8afc5646f13bf8e1a35a"
SRC_URI[sha256sum] = "d6432427010115061740f913e35e1197736d12e2c7630c9f6672029c9f7bc81e"

S = "${WORKDIR}/holes-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
