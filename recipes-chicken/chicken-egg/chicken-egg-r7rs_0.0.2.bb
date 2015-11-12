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

SRC_URI[md5sum] = "962409b0469c56fa90369b4042518f0a"
SRC_URI[sha256sum] = "a10fa793393abb1137a64c8dc8db0fb8c5de8b04c7495ffb654fd3e8ea34eabe"

S = "${WORKDIR}/r7rs-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
