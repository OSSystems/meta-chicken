SECTION = "devel/chicken"
DESCRIPTION = "barebones templating engine"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://templort.meta;md5=f182f2e08e9062e810d9a3167d84ed6f"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/templort/templort-${PV}.tar.gz"

SRC_URI[md5sum] = "7f2444f5752bbb798a56335764e0d72e"
SRC_URI[sha256sum] = "0156ddca71a464068ed965ee8ec061bc7963bd97b1e5714a37bd544d29c4cd35"

S = "${WORKDIR}/templort-${PV}"

require chicken-egg-templort.inc

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
