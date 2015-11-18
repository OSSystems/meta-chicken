SECTION = "devel/chicken"
DESCRIPTION = "A sorted dictionary data structure based on randomized search trees."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://treap.meta;md5=c3c4478a441c87376cbce53d9cf9568d"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/treap/treap-${PV}.tar.gz"

SRC_URI[md5sum] = "3b01068abd050ae4ed323591aca8b196"
SRC_URI[sha256sum] = "a101c543d51cf8fe97e73f366c5d52cbda864b4a44f9e9a2e07f6f7b135dbc9b"

S = "${WORKDIR}/treap-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
