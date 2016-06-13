SECTION = "devel/chicken"
DESCRIPTION = "POSIX Semaphores"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://posix-semaphore.meta;md5=3e7621fc448a97e15d59b1cbb81f49ac"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/posix-semaphore/posix-semaphore-${PV}.tar.gz"

SRC_URI[md5sum] = "b10870e14344f9f59c6079626b2dd489"
SRC_URI[sha256sum] = "4fd9274479408fe195a303f7ec65debe0bb94e641959ebe6c9faa55bc405ed7d"

S = "${WORKDIR}/posix-semaphore-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
