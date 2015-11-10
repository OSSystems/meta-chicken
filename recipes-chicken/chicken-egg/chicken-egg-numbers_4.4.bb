SECTION = "devel/chicken"
DESCRIPTION = "Full numeric tower support"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://numbers.meta;md5=69d1df76a955d24a5eca39aa3cfa723d"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/numbers/numbers-${PV}.tar.gz"

SRC_URI[md5sum] = "fe38fb892051251b3f11bedc99883fa0"
SRC_URI[sha256sum] = "20b5d68de33ce7fa68ff7aed38859f92e67de6975b2ebb9b0f356bfa86be2ab2"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
