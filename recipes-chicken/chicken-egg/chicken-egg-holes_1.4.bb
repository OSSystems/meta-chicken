SECTION = "devel/chicken"
DESCRIPTION = "partial expressions as procedures with named parameters"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://holes.meta;md5=f4548dfd255a14c1338082d8e7e0d63e"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/holes/holes-${PV}.tar.gz"

SRC_URI[md5sum] = "de813caa9968ad724d69b267f8128b47"
SRC_URI[sha256sum] = "90a34644a28125607b58fcfe2535b4e0c7a90ae80366ee69115903ed1900961c"

S = "${WORKDIR}/holes-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
