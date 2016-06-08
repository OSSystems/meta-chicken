SECTION = "devel/chicken"
DESCRIPTION = "A self-contained implementation of the AES / Rijndael encryption algorithm"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://aes.meta;md5=ae89c973ce63f5a1d71289323b0aab90"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/aes/aes-${PV}.tar.gz"

SRC_URI[md5sum] = "b0f4642c371ced22bc6fdcf64099f1b8"
SRC_URI[sha256sum] = "216c3041fa48af631b11dc7cec58527dc3206eaf171e899fe03552d23f3bc24f"

S = "${WORKDIR}/aes-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
