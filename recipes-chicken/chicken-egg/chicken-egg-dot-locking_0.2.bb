SECTION = "devel/chicken"
DESCRIPTION = "advisory locking mechanism based on standard file operations"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://dot-locking.meta;md5=15bb47021b2a47b90c321b0a66748488"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/dot-locking/dot-locking-${PV}.tar.gz"

SRC_URI[md5sum] = "cb80fa1850610b5de15f82c809e43864"
SRC_URI[sha256sum] = "523624ee8be68b1945029980e5cb7718e5474f3d899025b3554967c89b67c21b"

S = "${WORKDIR}/dot-locking-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
