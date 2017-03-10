SECTION = "devel/chicken"
DESCRIPTION = "implementation of lazy lists"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://lazy-lists.meta;md5=62bcc8f1338be9680f8aa89b680a28dd"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/lazy-lists/lazy-lists-${PV}.tar.gz"

SRC_URI[md5sum] = "c3c6ca3b8ed714b9cef989f03b74c6d9"
SRC_URI[sha256sum] = "cc5cb5c59bcf75e81c50ebdec8add2cf9f74805d3a7a343f5ba9f1b1edb9135e"

S = "${WORKDIR}/lazy-lists-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
