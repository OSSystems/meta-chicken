SECTION = "devel/chicken"
DESCRIPTION = "Functional arrays and sets"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://arrays.meta;md5=4006c8a428240859f11f54b6e8e8cc9f"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/arrays/arrays-${PV}.tar.gz"

SRC_URI[md5sum] = "859b4999cef039b1ab0142581a2947ef"
SRC_URI[sha256sum] = "6814ce851fc63e89d4605f95e56f4d1f8480ca102f39b068946b26b061fe03de"

S = "${WORKDIR}/arrays-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
