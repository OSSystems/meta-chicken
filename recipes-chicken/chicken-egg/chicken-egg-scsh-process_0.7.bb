SECTION = "devel/chicken"
DESCRIPTION = ""
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://scsh-process.meta;md5=d650e4d4b060d858a215b9090acefc24"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/scsh-process/scsh-process-${PV}.tar.gz"

SRC_URI[md5sum] = "3b3acf57ef056aa11c62d609b3798703"
SRC_URI[sha256sum] = "8bb285c26778e12d0dae61b4be01e1c0bc6e68b04d6157c3e5e250dad6047658"

S = "${WORKDIR}/scsh-process-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
