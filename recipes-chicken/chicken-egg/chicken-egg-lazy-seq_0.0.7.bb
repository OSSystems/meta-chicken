SECTION = "devel/chicken"
DESCRIPTION = "Clojure-like lazy sequences"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://lazy-seq.meta;md5=7b0aca26ce3d46be7e69a498204c5ef4"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/lazy-seq/lazy-seq-${PV}.tar.gz"

SRC_URI[md5sum] = "2fde5e52120ea78e5910370ef05814ef"
SRC_URI[sha256sum] = "330419da336e67410a1fb098f00df7f5a561f53ab2a612c1990f5a22c86a9d8e"

S = "${WORKDIR}/lazy-seq-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
