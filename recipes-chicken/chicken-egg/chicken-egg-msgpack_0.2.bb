SECTION = "devel/chicken"
DESCRIPTION = "MessagePack implementation for scheme"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://msgpack.meta;md5=209544492aa96bfa79ab314219fed2a9"
DEPENDS_append_class-cross = " chicken-egg-byte-blob-cross chicken-egg-numbers-cross chicken-egg-blob-utils-cross chicken-egg-bind-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-byte-blob-crosssdk chicken-egg-numbers-crosssdk chicken-egg-blob-utils-crosssdk chicken-egg-bind-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-byte-blob nativesdk-chicken-egg-numbers nativesdk-chicken-egg-blob-utils nativesdk-chicken-egg-bind chicken-egg-byte-blob-crosssdk chicken-egg-numbers-crosssdk chicken-egg-blob-utils-crosssdk chicken-egg-bind-crosssdk"
DEPENDS = " chicken-egg-byte-blob chicken-egg-numbers chicken-egg-blob-utils chicken-egg-bind chicken-egg-byte-blob-cross chicken-egg-numbers-cross chicken-egg-blob-utils-cross chicken-egg-bind-cross"
RDEPENDS_${PN} = " chicken-egg-byte-blob chicken-egg-numbers chicken-egg-blob-utils chicken-egg-bind"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/msgpack/msgpack-${PV}.tar.gz"

SRC_URI[md5sum] = "b227342ef117da419b3672d694b626c4"
SRC_URI[sha256sum] = "49ed0971933da8b9ab962e8e4eb2a9f415406599cb07d680ce289316ac8d065a"

S = "${WORKDIR}/msgpack-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
