SECTION = "devel/chicken"
DESCRIPTION = "SRFI-128: Comparators (reduced)"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-128.meta;md5=aed6f4fbb17c212d7c76d4f47f0f163d"
DEPENDS_append_class-cross = " chicken-egg-numbers-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-numbers-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-numbers chicken-egg-numbers-crosssdk"
DEPENDS = " chicken-egg-numbers chicken-egg-numbers-cross"
RDEPENDS_${PN} = " chicken-egg-numbers"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-128/srfi-128-${PV}.tar.gz"

SRC_URI[md5sum] = "43ce4bf17a61e4ba40831ab00ea161bf"
SRC_URI[sha256sum] = "a187d93bb4693449f76a5637bd128adf9b0b80cb1a53347f6489c2e9c3f493b6"

S = "${WORKDIR}/srfi-128-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
