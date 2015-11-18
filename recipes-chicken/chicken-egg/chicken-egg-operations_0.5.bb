SECTION = "devel/chicken"
DESCRIPTION = "The object system used in T"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://operations.meta;md5=38b75bfdc0fb1e97f8d8a2c6cd43efc9"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/operations/operations-${PV}.tar.gz"

SRC_URI[md5sum] = "a4cffa336198c958d3b72f8a1ee8bd89"
SRC_URI[sha256sum] = "ec610d69a03861640cc8b406ee0d486530cdd3b552358698c6e0fea860c1c823"

S = "${WORKDIR}/operations-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
