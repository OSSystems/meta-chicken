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

SRC_URI[md5sum] = "8ce73cd0d1e4d0328c5a43b28052a3b0"
SRC_URI[sha256sum] = "36b8fe9f245c03625eded8714cbfe77b9380be37980bbd0b457111973ce9bc58"

S = "${WORKDIR}/srfi-113-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
