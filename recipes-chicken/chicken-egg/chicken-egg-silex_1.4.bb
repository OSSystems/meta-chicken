SECTION = "devel/chicken"
DESCRIPTION = "An efficient and powerful lexer generator"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://silex.meta;md5=93fb213946103281561cb1c5761999fb"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "bb52819fbe2a411f488bd949a8d09cd9"
SRC_URI[sha256sum] = "5afa92971857d2a92ac5cfdeccf781397831e22dce80c8b122e39d27bc46aae8"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
