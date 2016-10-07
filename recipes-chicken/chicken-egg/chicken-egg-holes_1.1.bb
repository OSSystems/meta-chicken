SECTION = "devel/chicken"
DESCRIPTION = "partial expressions as procedures with named parameters"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://holes.meta;md5=f4548dfd255a14c1338082d8e7e0d63e"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/holes/holes-${PV}.tar.gz"

SRC_URI[md5sum] = "6d51af9e44d3837a9f2230b319a9158b"
SRC_URI[sha256sum] = "d09848667be8eb63defb75c8b22e5528440f61e3ff190e4cf38e4bd6c9a29a05"

S = "${WORKDIR}/holes-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
