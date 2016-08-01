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

SRC_URI[md5sum] = "8e5df29793652f5e85f4af6f8ecdf752"
SRC_URI[sha256sum] = "a46bea58a4d710c1d23e0700e4cfbaffa96905733d6881b59307d3cda6ce69db"

S = "${WORKDIR}/srfi-128-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
