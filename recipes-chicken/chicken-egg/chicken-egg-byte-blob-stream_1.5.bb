SECTION = "devel/chicken"
DESCRIPTION = "Lazy byte blobs"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://byte-blob-stream.meta;md5=4c4d04e61abdc6d9016ee50ead21d0b3"
DEPENDS_append_class-cross = " chicken-egg-srfi-41-cross chicken-egg-byte-blob-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-srfi-41-crosssdk chicken-egg-byte-blob-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-srfi-41 nativesdk-chicken-egg-byte-blob chicken-egg-srfi-41-crosssdk chicken-egg-byte-blob-crosssdk"
DEPENDS = " chicken-egg-srfi-41 chicken-egg-byte-blob chicken-egg-srfi-41-cross chicken-egg-byte-blob-cross"
RDEPENDS_${PN} = " chicken-egg-srfi-41 chicken-egg-byte-blob"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/byte-blob-stream/byte-blob-stream-${PV}.tar.gz"

SRC_URI[md5sum] = "c5eb36e33cc78e88dcc2ac0d7cc08744"
SRC_URI[sha256sum] = "e10756f2dd36f8868705b34e20c6cf7486ba913d385fb189233bfb2f6bc16710"

S = "${WORKDIR}/byte-blob-stream-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
