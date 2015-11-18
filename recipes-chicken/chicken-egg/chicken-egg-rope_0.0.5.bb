SECTION = "devel/chicken"
DESCRIPTION = "Heavyweight alternative to strings"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://rope.meta;md5=64a559854f0b36d96b2df83691685485"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/rope/rope-${PV}.tar.gz"

SRC_URI[md5sum] = "6146bd47d764aae70a7f3f51bfae1768"
SRC_URI[sha256sum] = "4e6dc13829a79f01243b85bd8ca77fd63e9e9a343f22952dc566fd3f3cd09ded"

S = "${WORKDIR}/rope-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
