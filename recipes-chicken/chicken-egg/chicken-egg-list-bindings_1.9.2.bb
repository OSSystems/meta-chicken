SECTION = "devel/chicken"
DESCRIPTION = "Binding pattern variables to subexpressions of nested lists"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://list-bindings.meta;md5=c15a04927693a6e06b316385d68d0668"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/list-bindings/list-bindings-${PV}.tar.gz"

SRC_URI[md5sum] = "6375729c05972489e580f145d15eb17b"
SRC_URI[sha256sum] = "6fa76b4180610765aca555d1b769cf57c30122b3f9c482444e81f0e33c2922ae"

S = "${WORKDIR}/list-bindings-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
