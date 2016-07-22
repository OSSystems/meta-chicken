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

SRC_URI[md5sum] = "f9fe1741bbcb7b8271384963ab2defa4"
SRC_URI[sha256sum] = "47089757a8fb7f7c53a2dedf02313581c60a66bc5f3ca751ebe7e5e8c8e9d500"

S = "${WORKDIR}/r7rs-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
