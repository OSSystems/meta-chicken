SECTION = "devel/chicken"
DESCRIPTION = "Base of the format procedures to generate output based on format strings.  This egg should not be used directly: the format-compiler egg should be used instead."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://format-compiler-base.meta;md5=52a2e78b8764c7720b881d615886e9b6"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/format-compiler-base/format-compiler-base-${PV}.tar.gz"

SRC_URI[md5sum] = "8a6a2345e99f85b85a8f89d68c73a07a"
SRC_URI[sha256sum] = "8640fdb2c14c08cdc8f6fbe530f402f6dcf734808b67bdecabc9447fe20b1b19"

S = "${WORKDIR}/format-compiler-base-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
