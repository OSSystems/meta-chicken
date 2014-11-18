SECTION = "devel/chicken"
DESCRIPTION = "FreeBSD random number generator"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://random-bsd.meta;md5=2ab09f162edbfa73fbc3bcef82cc9d8b"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "988e796bff9ef1d0c4616bd0442f1e03"
SRC_URI[sha256sum] = "eb73ebc4b8ca5e7867e93819c98e71243a4583938c8755f0f1ef4df5e43ae239"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
