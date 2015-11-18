SECTION = "devel/chicken"
DESCRIPTION = "Expands LLRB code customized to data structures.  Pure and mutating versions."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://llrb-syntax.meta;md5=4b0d8b83b4ffb212fe0ff38e5ca1ee1f"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/llrb-syntax/llrb-syntax-${PV}.tar.gz"

SRC_URI[md5sum] = "1c74b9517fdbd6aeb005c656a45a2871"
SRC_URI[sha256sum] = "b3030332b4311298bc166b1512d05284596c58b12dfb0a80a229c3800ac266f4"

S = "${WORKDIR}/llrb-syntax-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
