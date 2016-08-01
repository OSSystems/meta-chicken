SECTION = "devel/chicken"
DESCRIPTION = "Functional arrays and sets"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://arrays.meta;md5=4006c8a428240859f11f54b6e8e8cc9f"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/arrays/arrays-${PV}.tar.gz"

SRC_URI[md5sum] = "701038f0707062c9ad037c6e9dbbe057"
SRC_URI[sha256sum] = "7ab36eadf42a9691df22d2942c56d767e573c7c16c0dd89176d4f74f3c18ea01"

S = "${WORKDIR}/arrays-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
