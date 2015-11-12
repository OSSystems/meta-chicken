SECTION = "devel/chicken"
DESCRIPTION = "The SLIB character plotting library"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://charplot.meta;md5=4074581ce9f9b88f359662c1dfc36c9d"
DEPENDS_append_class-cross = " chicken-egg-numbers-cross chicken-egg-srfi-63-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-numbers-crosssdk chicken-egg-srfi-63-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-numbers nativesdk-chicken-egg-srfi-63 chicken-egg-numbers-crosssdk chicken-egg-srfi-63-crosssdk"
DEPENDS = " chicken-egg-numbers chicken-egg-srfi-63 chicken-egg-numbers-cross chicken-egg-srfi-63-cross"
RDEPENDS_${PN} = " chicken-egg-numbers chicken-egg-srfi-63"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/charplot/charplot-${PV}.tar.gz"

SRC_URI[md5sum] = "1f6dcec46b4fd1f331d99df91e35b502"
SRC_URI[sha256sum] = "37f0ba3437ab6f795f5dab55936275376173c07ed4baafde5e684a237d44f95a"

S = "${WORKDIR}/charplot-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
