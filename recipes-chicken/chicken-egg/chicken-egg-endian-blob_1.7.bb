SECTION = "devel/chicken"
DESCRIPTION = "Endian-specific procedures for converting blobs to numeric values and vectors."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://endian-blob.meta;md5=fadbe4bd35b2811183a947ce77bb1042"
DEPENDS_append_class-cross = " chicken-egg-byte-blob-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-byte-blob-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-byte-blob chicken-egg-byte-blob-crosssdk"
DEPENDS = " chicken-egg-byte-blob chicken-egg-byte-blob-cross"
RDEPENDS_${PN} = " chicken-egg-byte-blob"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/endian-blob/endian-blob-${PV}.tar.gz"

SRC_URI[md5sum] = "6097771f92f34ca4417cd27e8c32364c"
SRC_URI[sha256sum] = "71eef69bb9fbe215806565bceb2504e42f56c237d027d2385037d4972808dc9a"

S = "${WORKDIR}/endian-blob-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
