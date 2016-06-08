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

SRC_URI[md5sum] = "f834f61669d41ef51a4f144f84a9b0b7"
SRC_URI[sha256sum] = "6a93b990ae53e32b340940bf6bd0d80b5d54e46de8dcfdf3e03f0c8fba1babbb"

S = "${WORKDIR}/bencode-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
