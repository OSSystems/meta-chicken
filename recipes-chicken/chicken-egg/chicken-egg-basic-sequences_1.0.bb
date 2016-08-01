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

SRC_URI[md5sum] = "7ca4dac97c60e04e6a8b86623308b0ac"
SRC_URI[sha256sum] = "52fd913bb819a2d3e393d4661c12ab3b4965803b408307bc4028d2fb3d715fc0"

S = "${WORKDIR}/basic-sequences-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
