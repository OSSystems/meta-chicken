SECTION = "devel/chicken"
DESCRIPTION = "Immutable Lists."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-116.meta;md5=2d4ca65c2ad4b4f3dabd061eaa9e5802"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-116/srfi-116-${PV}.tar.gz"

SRC_URI[md5sum] = "13fc185c06e882578a1fcdafb95957c2"
SRC_URI[sha256sum] = "d08a48d9e8c7c8240c8dbb7ca1c77d44b3c146aac4bfe6ebb5f097f6325b6221"

S = "${WORKDIR}/srfi-116-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
