SECTION = "devel/chicken"
DESCRIPTION = "R7RS compatibility"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://r7rs.meta;md5=9977f4ac3fec209735f52a6bd1ba8196"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross chicken-egg-make-cross chicken-egg-numbers-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk chicken-egg-make-crosssdk chicken-egg-numbers-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable nativesdk-chicken-egg-make nativesdk-chicken-egg-numbers chicken-egg-matchable-crosssdk chicken-egg-make-crosssdk chicken-egg-numbers-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-make chicken-egg-numbers chicken-egg-matchable-cross chicken-egg-make-cross chicken-egg-numbers-cross chicken-egg-r7rs-cross"
RDEPENDS_${PN} = " chicken-egg-matchable chicken-egg-make chicken-egg-numbers"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/r7rs/r7rs-${PV}.tar.gz"

SRC_URI[md5sum] = "f01e7284a90573716a57f718e9080785"
SRC_URI[sha256sum] = "7211a4e5cdeb8031360aafa03e49197c93306bc142f84ccf260960c474105c46"

S = "${WORKDIR}/r7rs-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
