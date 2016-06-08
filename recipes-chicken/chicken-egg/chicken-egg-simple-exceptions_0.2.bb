SECTION = "devel/chicken"
DESCRIPTION = "Some user-friendly exception routines"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://simple-exceptions.meta;md5=8d3b1359d670144387e31b70c11ac52e"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/simple-exceptions/simple-exceptions-${PV}.tar.gz"

SRC_URI[md5sum] = "af8272b2a3a550d688d25bd1d9ba84a5"
SRC_URI[sha256sum] = "f6fe2231cd822acfdd45c91a4c1b189e1d8dff650ea4a3f4f41bc9f42d469f9d"

S = "${WORKDIR}/simple-exceptions-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
