SECTION = "devel/chicken"
DESCRIPTION = "Full numeric tower support"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://numbers.meta;md5=69d1df76a955d24a5eca39aa3cfa723d"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "8edd5d253d9f3055b1103bfbba4f1f7b"
SRC_URI[sha256sum] = "d98f8cf20cce2ecedf0c06dd18c0d299c604a4f2e4d01297d7d538ccbab6ef01"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
