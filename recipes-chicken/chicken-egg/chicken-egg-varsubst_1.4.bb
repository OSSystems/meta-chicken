SECTION = "devel/chicken"
DESCRIPTION = "Parameterized variable substitution procedures."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://varsubst.meta;md5=5f62fd4d0447f154ed2ed13f60267912"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/varsubst/varsubst-${PV}.tar.gz"

SRC_URI[md5sum] = "a47e3c648170611c3471be1a4a54ca8d"
SRC_URI[sha256sum] = "11323f8287968a85d90676f4afe7cf07d00b71ec345caf45d6e41681678cf1eb"

S = "${WORKDIR}/varsubst-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
