SECTION = "devel/chicken"
DESCRIPTION = "Clojure-like lazy sequences"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://lazy-seq.meta;md5=7b0aca26ce3d46be7e69a498204c5ef4"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "f8ae2366114b1e257631fa13c6132706"
SRC_URI[sha256sum] = "abf7ca86ef2fa1f7966774fc6d3966f504ec68273308f57a24e7b4ccd1bc1f5a"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
