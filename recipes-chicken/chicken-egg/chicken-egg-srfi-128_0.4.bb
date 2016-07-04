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

SRC_URI[md5sum] = "41e3de78f48707fb7e9ed3314a09fdac"
SRC_URI[sha256sum] = "27c63f3e575f09a3c3ce9b6dc7ef3ead93765467b23b6bd676556b2257125e73"

S = "${WORKDIR}/srfi-128-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
