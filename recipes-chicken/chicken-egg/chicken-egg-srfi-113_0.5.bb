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

SRC_URI[md5sum] = "81cfcdd0008937d69e91cb4d200b63cb"
SRC_URI[sha256sum] = "169f0a694065de7462f8913ca92855e33fcca375749efa85477916c2258796d9"

S = "${WORKDIR}/srfi-113-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
