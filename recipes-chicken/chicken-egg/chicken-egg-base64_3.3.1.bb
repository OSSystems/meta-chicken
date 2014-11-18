SECTION = "devel/chicken"
DESCRIPTION = "Encoding and decoding of base64 strings"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://base64.meta;md5=ec0b0735d03bfcf8be9885680e4f000f"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "127539c8fcbb32d08c7faf325a89dfaa"
SRC_URI[sha256sum] = "1336c65b9a29389d9569b4383622c5ee917dfc651ad82ff43f8e8ac2a71f3275"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
