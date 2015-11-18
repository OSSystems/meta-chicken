SECTION = "devel/chicken"
DESCRIPTION = "One-dimensional numerical interpolation."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://interp1d.meta;md5=f7e61914262c6e30e7fc5b6fb1e732d0"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/interp1d/interp1d-${PV}.tar.gz"

SRC_URI[md5sum] = "3d9556b11b9376443f0a91473bc65d20"
SRC_URI[sha256sum] = "a12a2050482a51af281c9f848f2be2af3a9dfc7a01be5a049a69e0d454cc9a30"

S = "${WORKDIR}/interp1d-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
