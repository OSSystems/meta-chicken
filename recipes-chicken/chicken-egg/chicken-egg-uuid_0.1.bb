SECTION = "devel/chicken"
DESCRIPTION = "A native implementation of UUID generation"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://uuid.meta;md5=09b2300375303e9065e4b426747f273f"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/uuid/uuid-${PV}.tar.gz"

SRC_URI[md5sum] = "14b710db44d0b4543bcbe043124992a1"
SRC_URI[sha256sum] = "da87b87f4f9d1e767bbe4cb449a80497c6e3fcfc33a9a5a6bb640a2fd987ca01"

S = "${WORKDIR}/uuid-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
