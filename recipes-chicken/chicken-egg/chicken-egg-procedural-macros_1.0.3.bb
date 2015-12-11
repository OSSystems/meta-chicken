SECTION = "devel/chicken"
DESCRIPTION = "Procedural-macros made easy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://procedural-macros.meta;md5=30e64d93f978bc22201937ffc8516d14"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/procedural-macros/procedural-macros-${PV}.tar.gz"

SRC_URI[md5sum] = "d4538fc554d5d9cb05c62b6935016b2a"
SRC_URI[sha256sum] = "1c88e88e5b9c0cdda5dde4b3b0c5011e7d5f0fa0c5738e69198ba420f97855f2"

S = "${WORKDIR}/procedural-macros-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
