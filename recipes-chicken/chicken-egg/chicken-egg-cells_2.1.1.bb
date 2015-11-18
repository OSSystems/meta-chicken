SECTION = "devel/chicken"
DESCRIPTION = "Implementation of typed cells to replace general set! operators"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://cells.meta;md5=98eb2f08ad844af0e0be2e60406f7631"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/cells/cells-${PV}.tar.gz"

SRC_URI[md5sum] = "6ff75cd978d78cc6045ec16fa6bf1897"
SRC_URI[sha256sum] = "6f46b6ca295e628d44b848895dead684653157401c59d4db92e361e34fe70a7d"

S = "${WORKDIR}/cells-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
