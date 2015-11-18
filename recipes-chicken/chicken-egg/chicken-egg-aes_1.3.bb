SECTION = "devel/chicken"
DESCRIPTION = "A self-contained implementation of the AES / Rijndael encryption algorithm"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://aes.meta;md5=ae89c973ce63f5a1d71289323b0aab90"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/aes/aes-${PV}.tar.gz"

SRC_URI[md5sum] = "f3f2830fd23c396518dba699e04b692b"
SRC_URI[sha256sum] = "bc9b2e78100db66df50ec84f34e7df139dd7df9544098249bd71564283218d16"

S = "${WORKDIR}/aes-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
