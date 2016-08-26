SECTION = "devel/chicken"
DESCRIPTION = "A self-contained implementation of the AES / Rijndael encryption algorithm"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://aes.meta;md5=ae89c973ce63f5a1d71289323b0aab90"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/aes/aes-${PV}.tar.gz"

SRC_URI[md5sum] = "133f962172361b38643c30b94d95ad70"
SRC_URI[sha256sum] = "7bf48884bdcf704505706690c74f452dcfcb3a2701673f4eb5c5694fcd84e26a"

S = "${WORKDIR}/aes-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
