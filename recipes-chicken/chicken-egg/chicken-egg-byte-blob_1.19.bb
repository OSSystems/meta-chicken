SECTION = "devel/chicken"
DESCRIPTION = "Byte array utility procedures for blobs."
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://byte-blob.meta;md5=b7318a6d51a0dd606d55f9c48fbd5663"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/byte-blob/byte-blob-${PV}.tar.gz"

SRC_URI[md5sum] = "15405260fd4b631abc1a3db9b910b1ac"
SRC_URI[sha256sum] = "ecdaed988a764f87dd6d99e2fa9209fba738163af52349274be4c9c99922a8d6"

S = "${WORKDIR}/byte-blob-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
