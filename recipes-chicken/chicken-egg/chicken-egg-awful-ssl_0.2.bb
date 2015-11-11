SECTION = "devel/chicken"
DESCRIPTION = "SSL support for awful"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://awful-ssl.meta;md5=3b9b3cb66ac772374accc483dfe155a9"
DEPENDS_append_class-cross = " chicken-egg-awful-cross chicken-egg-openssl-cross chicken-egg-spiffy-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-awful-crosssdk chicken-egg-openssl-crosssdk chicken-egg-spiffy-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-awful nativesdk-chicken-egg-openssl nativesdk-chicken-egg-spiffy chicken-egg-awful-crosssdk chicken-egg-openssl-crosssdk chicken-egg-spiffy-crosssdk"
DEPENDS = " chicken-egg-awful chicken-egg-openssl chicken-egg-spiffy chicken-egg-awful-cross chicken-egg-openssl-cross chicken-egg-spiffy-cross"
RDEPENDS_${PN} = " chicken-egg-awful chicken-egg-openssl chicken-egg-spiffy"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/awful-ssl/awful-ssl-${PV}.tar.gz"

SRC_URI[md5sum] = "e4f49bc1d819ac331022a988a9263ff2"
SRC_URI[sha256sum] = "53a0c3f498200f0834e6c048f677a978b7d0466d9efe3d8513b5a8ff12ea6591"

S = "${WORKDIR}/awful-ssl-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
