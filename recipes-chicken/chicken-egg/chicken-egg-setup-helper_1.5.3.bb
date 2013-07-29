SECTION = "devel/chicken"
DESCRIPTION = "Installation/Setup Shortcut Routines"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://setup-helper.meta;md5=daf5ef3d9c531d2f70f0140f11daac33"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "208d1ad6a8d3a19f43c2cb83474cf9ca"
SRC_URI[sha256sum] = "fc380b82a83656c58cc5facedeccc1c52796c01c7d76fff6808ee753268a0747"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
