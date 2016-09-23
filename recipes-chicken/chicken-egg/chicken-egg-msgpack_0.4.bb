SECTION = "devel/chicken"
DESCRIPTION = "MessagePack implementation for CHICKEN"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://msgpack.meta;md5=d5924055ed67af68d7ca291896c5248a"
DEPENDS_append_class-cross = " chicken-egg-byte-blob-cross chicken-egg-numbers-cross chicken-egg-blob-utils-cross chicken-egg-bind-cross chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-byte-blob-crosssdk chicken-egg-numbers-crosssdk chicken-egg-blob-utils-crosssdk chicken-egg-bind-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-byte-blob nativesdk-chicken-egg-numbers nativesdk-chicken-egg-blob-utils nativesdk-chicken-egg-bind nativesdk-chicken-egg-matchable chicken-egg-byte-blob-crosssdk chicken-egg-numbers-crosssdk chicken-egg-blob-utils-crosssdk chicken-egg-bind-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-byte-blob chicken-egg-numbers chicken-egg-blob-utils chicken-egg-bind chicken-egg-matchable chicken-egg-byte-blob-cross chicken-egg-numbers-cross chicken-egg-blob-utils-cross chicken-egg-bind-cross chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-byte-blob chicken-egg-numbers chicken-egg-blob-utils chicken-egg-bind chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/msgpack/msgpack-${PV}.tar.gz"

SRC_URI[md5sum] = "72409e6488b3de755481fb64b251d98d"
SRC_URI[sha256sum] = "a47de7395070de82939e5492c79d10560e7c880e0dc6a725283c7522a5f8fb1f"

S = "${WORKDIR}/msgpack-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
