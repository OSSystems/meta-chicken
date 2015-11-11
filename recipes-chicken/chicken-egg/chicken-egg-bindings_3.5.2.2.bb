SECTION = "devel/chicken"
DESCRIPTION = "Binding pattern variables to subexpressions of nested sequences with application to macro-constructors"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://bindings.meta;md5=2a3a3a01c381fbdfe96607a5ddd527c8"
DEPENDS = " chicken-egg-bindings-cross"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/bindings/bindings-${PV}.tar.gz"

SRC_URI[md5sum] = "cfb3761913121c5329748e73653a0197"
SRC_URI[sha256sum] = "f26c1b9a58f929f9fb8f0b4971c971f317f976f0105117ed23b5acfe4592f9eb"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
