SECTION = "devel/chicken"
DESCRIPTION = ""
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://scsh-process.meta;md5=d650e4d4b060d858a215b9090acefc24"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/scsh-process/scsh-process-${PV}.tar.gz"

SRC_URI[md5sum] = "4e52dff06fe04dc4c30c4920cb94fbc5"
SRC_URI[sha256sum] = "b869cab118629962e3d692507f191cd6fb12286808f6e9324e8d93faad1a6321"

S = "${WORKDIR}/scsh-process-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
