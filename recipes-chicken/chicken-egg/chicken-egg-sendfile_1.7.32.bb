SECTION = "devel/chicken"
DESCRIPTION = "Sending a file over the network"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sendfile.meta;md5=94768e871f220519beb3aea593613e86"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sendfile/sendfile-${PV}.tar.gz"

SRC_URI[md5sum] = "f227583e7438d00d03b9cc2822977b1a"
SRC_URI[sha256sum] = "8b28e31fbe2d3d454019492f1fea36358a7acc8576b28f28f87bf2839916d758"

S = "${WORKDIR}/sendfile-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
