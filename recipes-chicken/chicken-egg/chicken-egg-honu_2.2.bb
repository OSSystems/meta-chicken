SECTION = "devel/chicken"
DESCRIPTION = "A parser for honu' syntax"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://honu.meta;md5=5be7f62330fb9bf4d4a8f0af36e1c9d6"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/honu/honu-${PV}.tar.gz"

SRC_URI[md5sum] = "a391373ee375cc768028e1b9a0c1bf69"
SRC_URI[sha256sum] = "66bd9022a7fa0543f39c96cb76a378b377fd3e2b323ebf64e9f3bfff4399a392"

S = "${WORKDIR}/honu-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
