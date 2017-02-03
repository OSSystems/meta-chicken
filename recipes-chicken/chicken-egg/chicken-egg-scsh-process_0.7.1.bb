SECTION = "devel/chicken"
DESCRIPTION = ""
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://scsh-process.meta;md5=d650e4d4b060d858a215b9090acefc24"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/scsh-process/scsh-process-${PV}.tar.gz"

SRC_URI[md5sum] = "a441b23c83c58dc82d4c28bd137c2eb9"
SRC_URI[sha256sum] = "dbce6cfa232e90a171b60e2723601f44398c57b751ab9838f8e6fd02b8516d86"

S = "${WORKDIR}/scsh-process-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
