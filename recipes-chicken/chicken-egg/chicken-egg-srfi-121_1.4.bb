SECTION = "devel/chicken"
DESCRIPTION = "SRFI-121: Generators"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-121.meta;md5=334a32e4f28d23310bb48799357abb1d"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-121/srfi-121-${PV}.tar.gz"

SRC_URI[md5sum] = "9ff555f9544122bb94a110444d4b9e7f"
SRC_URI[sha256sum] = "3b288ce92bed48737af21df138c37191ad4d13bfaac029f82bb27343b360d323"

S = "${WORKDIR}/srfi-121-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
