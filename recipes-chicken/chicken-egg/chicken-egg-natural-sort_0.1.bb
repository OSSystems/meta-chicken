SECTION = "devel/chicken"
DESCRIPTION = "Natural sorting procedures"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://natural-sort.meta;md5=24e0f423418eea84cc64ef7ead9dc831"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/natural-sort/natural-sort-${PV}.tar.gz"

SRC_URI[md5sum] = "941773a37ffa779c9c7f205fa5f98c8a"
SRC_URI[sha256sum] = "329ca7d9346895ac4473bb3972bf9bbc8dd7969f583c80ae612baebcdff1217e"

S = "${WORKDIR}/natural-sort-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
