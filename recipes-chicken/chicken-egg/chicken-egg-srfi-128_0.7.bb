SECTION = "devel/chicken"
DESCRIPTION = "SRFI-128: Comparators (reduced)"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-128.meta;md5=ab01b830a8f3f280865690c3feb3ab1a"
DEPENDS_append_class-cross = " chicken-egg-numbers-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-numbers-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-numbers chicken-egg-numbers-crosssdk"
DEPENDS = " chicken-egg-numbers chicken-egg-numbers-cross"
RDEPENDS_${PN} = " chicken-egg-numbers"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-128/srfi-128-${PV}.tar.gz"

SRC_URI[md5sum] = "5a3df232f8981764e5f375db0ba3ff6d"
SRC_URI[sha256sum] = "ddfe62dd95f33ea59251a4e71cf8dbe02354e54ade765e9c32c77370739909d3"

S = "${WORKDIR}/srfi-128-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
