SECTION = "devel/chicken"
DESCRIPTION = "Procedures memoization"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://memoize.meta;md5=9d12e8fdd349c206e15ce86135c2febc"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/memoize/memoize-${PV}.tar.gz"

SRC_URI[md5sum] = "301dcb4f219b8be28e4af38a6c76c67f"
SRC_URI[sha256sum] = "f6dd9e221960d9fd25bc34fdedbb62a561f36ea549b886441793c29f899e095c"

S = "${WORKDIR}/memoize-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
