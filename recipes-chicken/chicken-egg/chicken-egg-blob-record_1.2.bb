SECTION = "devel/chicken"
DESCRIPTION = "A facility for representing records as blobs."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://blob-record.meta;md5=1b592e91e328dfe694f5dfb229d7bd54"
DEPENDS_append_class-cross = " chicken-egg-byte-blob-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-byte-blob-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-byte-blob chicken-egg-byte-blob-crosssdk"
DEPENDS = " chicken-egg-byte-blob chicken-egg-byte-blob-cross"
RDEPENDS_${PN} = " chicken-egg-byte-blob"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/blob-record/blob-record-${PV}.tar.gz"

SRC_URI[md5sum] = "77d84eb2b39c486ef5fb093d46bfc4c1"
SRC_URI[sha256sum] = "f231d9203c88d3ebfe7fbe718397dd1257799c65fcdc2a15711ec8ac1b5d9428"

S = "${WORKDIR}/blob-record-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
