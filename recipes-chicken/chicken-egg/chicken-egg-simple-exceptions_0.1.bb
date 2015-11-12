SECTION = "devel/chicken"
DESCRIPTION = "Some user-friendly exception routines"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://simple-exceptions.meta;md5=8d3b1359d670144387e31b70c11ac52e"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/simple-exceptions/simple-exceptions-${PV}.tar.gz"

SRC_URI[md5sum] = "156f73b524aa5317229ba94a3a187a49"
SRC_URI[sha256sum] = "b7eb1a59426894085efa869ff72d08019747ee0a47148a861244cc47f1399610"

S = "${WORKDIR}/simple-exceptions-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
