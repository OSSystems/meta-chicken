SECTION = "devel/chicken"
DESCRIPTION = "Creating concrete-, abstract- and object-types"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://datatypes.meta;md5=638d42ae61fb64b145be397b25a8836e"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/datatypes/datatypes-${PV}.tar.gz"

SRC_URI[md5sum] = "ddd0281506e468d9ac6e2723f31800b9"
SRC_URI[sha256sum] = "514fe4f7fe4347f6dd24fdc69a0999cba7c9371a3a05068828f702fa69fc49b7"

S = "${WORKDIR}/datatypes-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
