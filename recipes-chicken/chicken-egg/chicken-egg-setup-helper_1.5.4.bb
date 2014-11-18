SECTION = "devel/chicken"
DESCRIPTION = "Installation/Setup Shortcut Routines"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://setup-helper.meta;md5=daf5ef3d9c531d2f70f0140f11daac33"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "f4c44ed4529804620b98331445aeaba6"
SRC_URI[sha256sum] = "90a644b5e57a07b062f81f0a1633684bd4f823561be7670e10c17b86a0cb897b"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
