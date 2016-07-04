SECTION = "devel/chicken"
DESCRIPTION = "Asynchronous I/O"
LICENSE = "3 Clause BSD"
LIC_FILES_CHKSUM = "file://async-io.meta;md5=007c8cb138ee951cb99f224cc50f51db"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/async-io/async-io-${PV}.tar.gz"

SRC_URI[md5sum] = "ce643a7caa44e58d61285f501cdef88d"
SRC_URI[sha256sum] = "6af9693a359ff517ea606ba6c1c5a657921c4e80c67c5ea69b278c6f868e98b3"

S = "${WORKDIR}/async-io-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
