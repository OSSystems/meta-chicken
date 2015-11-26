SECTION = "devel/chicken"
DESCRIPTION = "Procedural-macros and destructuring bindings made easy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://bindings.meta;md5=1dacc6b5e905c4ff741f95eb47947e36"
DEPENDS = " chicken-egg-bindings-cross"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/bindings/bindings-${PV}.tar.gz"

SRC_URI[md5sum] = "a7a472d3d35a40e966a0433bee9b5e6c"
SRC_URI[sha256sum] = "26c6d21274cc7d48df20c7f7eba7ac1704668c5a8f892c3119696b8bcbb3e363"

S = "${WORKDIR}/bindings-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
