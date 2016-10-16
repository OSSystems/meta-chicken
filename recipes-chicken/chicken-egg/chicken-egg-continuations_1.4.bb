SECTION = "devel/chicken"
DESCRIPTION = "Continuations as a separate datatype"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://continuations.meta;md5=11a023ca713824783ee612ad86bd1a0d"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/continuations/continuations-${PV}.tar.gz"

SRC_URI[md5sum] = "3f37408d928d16c8740b16055fb239a1"
SRC_URI[sha256sum] = "c96f703cf37947bfd27e47640f5615b423dc396532075ac9d1c9b365bb9f26fb"

S = "${WORKDIR}/continuations-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
