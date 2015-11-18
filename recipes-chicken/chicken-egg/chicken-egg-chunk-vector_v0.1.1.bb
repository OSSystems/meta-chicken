SECTION = "devel/chicken"
DESCRIPTION = "A dyn-vector like library capable of storing other srfi-4 vectors inside a dense array."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://chunk-vector.meta;md5=f950acec4a6cd53c624e252896b4f286"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/chunk-vector/chunk-vector-${PV}.tar.gz"

SRC_URI[md5sum] = "1157c0793baf33c1aca87697f9c16e2f"
SRC_URI[sha256sum] = "c3ab44f99297f63ffe07531e68cc6447f421f7577165d71f240469d93cdc713f"

S = "${WORKDIR}/chunk-vector-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
