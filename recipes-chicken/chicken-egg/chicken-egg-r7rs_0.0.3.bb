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

SRC_URI[md5sum] = "0bb72059b788997851f01d3fd8932fc1"
SRC_URI[sha256sum] = "b672c54c0fad3cb8d1e0e30bae0a6770763a76eb9ccb5cd8b1a87dedb886b399"

S = "${WORKDIR}/r7rs-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
