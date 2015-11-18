SECTION = "devel/chicken"
DESCRIPTION = ""Callable" data structures"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://callable-data-structures.meta;md5=7db1759c587d52bb80a1059505af1d2d"
DEPENDS = " chicken-egg-callable-data-structures-cross"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/callable-data-structures/callable-data-structures-${PV}.tar.gz"

SRC_URI[md5sum] = "50696cda0f89959c376b1eaeb94faa5c"
SRC_URI[sha256sum] = "360b3b206420e955b1711f1c563c81ef6501c5364ab4548c82441e0fd4800767"

S = "${WORKDIR}/callable-data-structures-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
