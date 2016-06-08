SECTION = "devel/chicken"
DESCRIPTION = "Full numeric tower support"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://numbers.meta;md5=69d1df76a955d24a5eca39aa3cfa723d"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/numbers/numbers-${PV}.tar.gz"

SRC_URI[md5sum] = "c617db5467f98def7b0c6624892793f2"
SRC_URI[sha256sum] = "15ccbbfe296d8fecb83ebc0273773023da60c3da0058d7f28530d361259673cf"

S = "${WORKDIR}/numbers-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
