SECTION = "devel/chicken"
DESCRIPTION = "Basic sequence procedures"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://basic-sequences.meta;md5=7052415f825fb8d9a0ae3362e890d431"
DEPENDS_append_class-cross = " chicken-egg-simple-exceptions-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-simple-exceptions-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-simple-exceptions chicken-egg-simple-exceptions-crosssdk"
DEPENDS = " chicken-egg-simple-exceptions chicken-egg-simple-exceptions-cross"
RDEPENDS_${PN} = " chicken-egg-simple-exceptions"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/basic-sequences/basic-sequences-${PV}.tar.gz"

SRC_URI[md5sum] = "899b0b54758b4e82d300d57a71102f76"
SRC_URI[sha256sum] = "041b8eb468f14d00fddfbb7c8d61571ba5d2b9d756b78382d9966462e12b52e2"

S = "${WORKDIR}/basic-sequences-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
