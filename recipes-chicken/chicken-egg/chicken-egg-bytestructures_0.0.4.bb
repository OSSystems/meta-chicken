SECTION = "devel/chicken"
DESCRIPTION = "Structured access to bytevector contents"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://bytestructures.meta;md5=213b4bebe91576adc81fd570a527374b"
DEPENDS_append_class-cross = " chicken-egg-r7rs-cross chicken-egg-r6rs-bytevectors-cross chicken-egg-srfi-60-cross chicken-egg-format-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-r7rs-crosssdk chicken-egg-r6rs-bytevectors-crosssdk chicken-egg-srfi-60-crosssdk chicken-egg-format-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-r7rs nativesdk-chicken-egg-r6rs-bytevectors nativesdk-chicken-egg-srfi-60 nativesdk-chicken-egg-format chicken-egg-r7rs-crosssdk chicken-egg-r6rs-bytevectors-crosssdk chicken-egg-srfi-60-crosssdk chicken-egg-format-crosssdk"
DEPENDS = " chicken-egg-r7rs chicken-egg-r6rs-bytevectors chicken-egg-srfi-60 chicken-egg-format chicken-egg-r7rs-cross chicken-egg-r6rs-bytevectors-cross chicken-egg-srfi-60-cross chicken-egg-format-cross chicken-egg-bytestructures-cross"
RDEPENDS_${PN} = " chicken-egg-r7rs chicken-egg-r6rs-bytevectors chicken-egg-srfi-60 chicken-egg-format"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/bytestructures/bytestructures-${PV}.tar.gz"

SRC_URI[md5sum] = "944ab401f628e02a91d8457a9c361202"
SRC_URI[sha256sum] = "b82ac6cc1c161c9587b7e3a295602c077b9bba503188bb32904a3e8d88868a40"

S = "${WORKDIR}/bytestructures-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
