SECTION = "devel/chicken"
DESCRIPTION = "R7RS implementation of R6RS Bytevectors"
LICENSE = "Larceny"
LIC_FILES_CHKSUM = "file://r6rs-bytevectors.meta;md5=ff98f84b17f0f00b2972b6bd22ad7d0c"
DEPENDS_append_class-cross = " chicken-egg-r7rs-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-r7rs-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-r7rs chicken-egg-r7rs-crosssdk"
DEPENDS = " chicken-egg-r7rs chicken-egg-r7rs-cross"
RDEPENDS_${PN} = " chicken-egg-r7rs"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/r6rs-bytevectors/r6rs-bytevectors-${PV}.tar.gz"

SRC_URI[md5sum] = "7cc16f966949903b7e9b246c20d3f80e"
SRC_URI[sha256sum] = "3173a9cc4c5b3a7eca3150de044dd67eee5aa947e003d120e4c28cebb854e10a"

S = "${WORKDIR}/r6rs-bytevectors-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
