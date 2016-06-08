SECTION = "devel/chicken"
DESCRIPTION = "The SLIB color library"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://color.meta;md5=c0e32d3f49e8e77e24523a869a97085e"
DEPENDS_append_class-cross = " chicken-egg-fmt-cross chicken-egg-records-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-fmt-crosssdk chicken-egg-records-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-fmt nativesdk-chicken-egg-records chicken-egg-fmt-crosssdk chicken-egg-records-crosssdk"
DEPENDS = " chicken-egg-fmt chicken-egg-records chicken-egg-fmt-cross chicken-egg-records-cross"
RDEPENDS_${PN} = " chicken-egg-fmt chicken-egg-records"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/color/color-${PV}.tar.gz"

SRC_URI[md5sum] = "669451b2f66308599d555dbedd0474c5"
SRC_URI[sha256sum] = "2f69cb0713ffd226cde5777c5f99e68b0e443e24c5b2aba915ecd35e77824344"

S = "${WORKDIR}/color-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
