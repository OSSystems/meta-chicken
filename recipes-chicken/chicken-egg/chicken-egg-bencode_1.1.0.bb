SECTION = "devel/chicken"
DESCRIPTION = "Bencoding parser and serializer"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://bencode.meta;md5=a86ca42f50b39ec12833b0d702d40049"
DEPENDS_append_class-cross = " chicken-egg-miscmacros-cross chicken-egg-vector-lib-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-miscmacros-crosssdk chicken-egg-vector-lib-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-vector-lib chicken-egg-miscmacros-crosssdk chicken-egg-vector-lib-crosssdk"
DEPENDS = " chicken-egg-miscmacros chicken-egg-vector-lib chicken-egg-miscmacros-cross chicken-egg-vector-lib-cross"
RDEPENDS_${PN} = " chicken-egg-miscmacros chicken-egg-vector-lib"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/bencode/bencode-${PV}.tar.gz"

SRC_URI[md5sum] = "4b2df1112677b2573a738b8250c1105e"
SRC_URI[sha256sum] = "6ccca219d01552e1b6e86ea876a01477d8a9bd1ff536b9b1869f70f025257478"

S = "${WORKDIR}/bencode-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
