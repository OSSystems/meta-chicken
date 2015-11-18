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

SRC_URI[md5sum] = "256174c7be790f7cdc4912f445869521"
SRC_URI[sha256sum] = "f4c5a7defb382e2118b05009fdb3da2b299d2e0a50a41c7c2a0d7b1964cc1303"

S = "${WORKDIR}/bencode-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
