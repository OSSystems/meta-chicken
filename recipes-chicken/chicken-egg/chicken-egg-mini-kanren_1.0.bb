SECTION = "devel/chicken"
DESCRIPTION = "Provides canonical miniKanren language - https://github.com/miniKanren/miniKanren"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mini-kanren.meta;md5=0143aa0da905ae4727a4fdec90a84820"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/mini-kanren/mini-kanren-${PV}.tar.gz"

SRC_URI[md5sum] = "255467079a7daf9844cd68efd122ec7b"
SRC_URI[sha256sum] = "efd82da1b3bdf252295fe4d20e9c1ac710b4dc705c9de9218c6f6c6450f55684"

S = "${WORKDIR}/mini-kanren-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
