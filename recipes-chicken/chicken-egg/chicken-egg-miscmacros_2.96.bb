SECTION = "devel/chicken"
DESCRIPTION = "Various helper macros"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://miscmacros.meta;md5=04fe25a9e0effaa01799eb2d76e6aad2"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/miscmacros/miscmacros-${PV}.tar.gz"

SRC_URI[md5sum] = "cbe89e951913cb45e9f4f9a79c00f55e"
SRC_URI[sha256sum] = "d622996d273d0d62e2f7a060007f145e13c9f54f9d26c01508a73154fdffcf75"

S = "${WORKDIR}/miscmacros-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
