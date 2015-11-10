SECTION = "devel/chicken"
DESCRIPTION = "Sending a file over the network"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sendfile.meta;md5=94768e871f220519beb3aea593613e86"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sendfile/sendfile-${PV}.tar.gz"

SRC_URI[md5sum] = "77deb49519839770491433f0c52cf495"
SRC_URI[sha256sum] = "237b8aa11b21ac46fa61fb9cdb6cd96659f99d0e437193c150aa88bb806362ee"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
