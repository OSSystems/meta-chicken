SECTION = "devel/chicken"
DESCRIPTION = "Continuations as a separate datatype"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://continuations.meta;md5=11a023ca713824783ee612ad86bd1a0d"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/continuations/continuations-${PV}.tar.gz"

SRC_URI[md5sum] = "ee1aa203c7adf952015f8860c968d9ab"
SRC_URI[sha256sum] = "8e3493c11d802c89cb358e896fe6a961a8ac4045dc544ef601300e3dd70ed247"

S = "${WORKDIR}/continuations-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
