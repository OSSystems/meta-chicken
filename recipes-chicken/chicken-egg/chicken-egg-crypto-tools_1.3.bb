SECTION = "devel/chicken"
DESCRIPTION = "Useful cryptographic primitives"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://crypto-tools.meta;md5=e578613bb73004d1f7d39d78939be768"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/crypto-tools/crypto-tools-${PV}.tar.gz"

SRC_URI[md5sum] = "892bba95bb5b9bae674f83f674e33fdd"
SRC_URI[sha256sum] = "1946153b1b8c0ac5ae2466490bc81fb246c18a8fe4466b70d27a4d4a10ebadff"

S = "${WORKDIR}/crypto-tools-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
