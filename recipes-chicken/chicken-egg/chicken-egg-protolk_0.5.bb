SECTION = "devel/chicken"
DESCRIPTION = "Flexible Scheme objects with message passing and prototypes"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://protolk.meta;md5=db6fbe3ae2a78916e74fe5cf0e41a5c3"
DEPENDS = " chicken-egg-protolk-cross"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/protolk/protolk-${PV}.tar.gz"

SRC_URI[md5sum] = "c2fd559e1f6756b77b66dee82a746803"
SRC_URI[sha256sum] = "108dbd663ef7c6da879538bab2d6b887a4cbb629d23a09a1a58e0e8841d50126"

S = "${WORKDIR}/protolk-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
