SECTION = "devel/chicken"
DESCRIPTION = "Installation/Setup Shortcut Routines"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://setup-helper.meta;md5=daf5ef3d9c531d2f70f0140f11daac33"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/setup-helper/setup-helper-${PV}.tar.gz"

SRC_URI[md5sum] = "d32aff010ca76a6909adbb0ecff94fee"
SRC_URI[sha256sum] = "ebb809050d7012d67a517f428c4db2b9302e14c07d2676dafa5ee2994e3a7b6b"

S = "${WORKDIR}/setup-helper-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
