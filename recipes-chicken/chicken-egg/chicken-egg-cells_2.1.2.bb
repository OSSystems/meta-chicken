SECTION = "devel/chicken"
DESCRIPTION = "Implementation of typed cells to replace general set! operators"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://cells.meta;md5=6ece06becd30546ca5cc67217abfc358"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/cells/cells-${PV}.tar.gz"

SRC_URI[md5sum] = "af1c1dcea4e469cadd9526e1444a9f6d"
SRC_URI[sha256sum] = "876098a71f44e1912199100613ba4cd0ee4854664462566bcf0233cc914efe27"

S = "${WORKDIR}/cells-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
