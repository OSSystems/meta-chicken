SECTION = "devel/chicken"
DESCRIPTION = "implementation of lazy lists"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://lazy-lists.meta;md5=62bcc8f1338be9680f8aa89b680a28dd"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/lazy-lists/lazy-lists-${PV}.tar.gz"

SRC_URI[md5sum] = "51cb8d8987a14c4025b8ca4b92735d3e"
SRC_URI[sha256sum] = "0a547cb78cc99cd0c2b2e6d47490b52035a98711f28733e0d58c3a97ab297fbe"

S = "${WORKDIR}/lazy-lists-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
