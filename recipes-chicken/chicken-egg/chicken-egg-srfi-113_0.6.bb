SECTION = "devel/chicken"
DESCRIPTION = "Sets and Bags."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-113.meta;md5=c4737951a56906d18f6bdd894155a523"
DEPENDS_append_class-cross = " chicken-egg-srfi-128-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-srfi-128-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-srfi-128 chicken-egg-srfi-128-crosssdk"
DEPENDS = " chicken-egg-srfi-128 chicken-egg-srfi-128-cross"
RDEPENDS_${PN} = " chicken-egg-srfi-128"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-113/srfi-113-${PV}.tar.gz"

SRC_URI[md5sum] = "60a94352608382b0d0d1c24045abcf6c"
SRC_URI[sha256sum] = "8b28e3b5cf65ce977c280c2811162ddf3f3139398c247a3298ea6c313b6f3628"

S = "${WORKDIR}/srfi-113-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
