SECTION = "devel/chicken"
DESCRIPTION = "Graph description generator for graphs of arbitrary objects."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://object-graph.meta;md5=4f30dd55d7ae170af4206f8b50ea1514"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/object-graph/object-graph-${PV}.tar.gz"

SRC_URI[md5sum] = "68387d166a37b750ee9eff1db5b7744f"
SRC_URI[sha256sum] = "f89474efa8167f25cb0126d95e29fc0f3b11296b80b43b8c7c84e30895e20e1d"

S = "${WORKDIR}/object-graph-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
