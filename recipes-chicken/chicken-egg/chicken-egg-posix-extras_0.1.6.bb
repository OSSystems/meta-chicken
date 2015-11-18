SECTION = "devel/chicken"
DESCRIPTION = "Things the posix unit forgot"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://posix-extras.meta;md5=eb430ca459c8910ee24acbce893c454c"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/posix-extras/posix-extras-${PV}.tar.gz"

SRC_URI[md5sum] = "57bc301e9395010bc81aef2153f32cd3"
SRC_URI[sha256sum] = "62c01839bb6fe395b1049e6a88c7eb2fec677a5161e13d9f741f0b1c6c40ac56"

S = "${WORKDIR}/posix-extras-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
