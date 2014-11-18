SECTION = "devel/chicken"
DESCRIPTION = "Colorize programming code as HTML"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://colorize.meta;md5=67cab41305f064905e704435a4e968b1"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "0c83fcdb6f2f1eaf8a436369a2a8d967"
SRC_URI[sha256sum] = "769502029bbb47b5b2d098c0add99ffc733d426cc005eb9af1a70de4517fe449"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
