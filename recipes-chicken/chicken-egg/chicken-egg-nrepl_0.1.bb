SECTION = "devel/chicken"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://nrepl.meta;md5=91cf745b1518d56a17ade4c0c2304b9d"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/nrepl/nrepl-${PV}.tar.gz"

SRC_URI[md5sum] = "cb95bb56a71ab8a6c4abc3c6bb9ef8dc"
SRC_URI[sha256sum] = "e3582ba2d0e877d7acbf35e5c2ad6ac6f7936aed29cdb671125d1d774fd8e2c9"

S = "${WORKDIR}/nrepl-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
