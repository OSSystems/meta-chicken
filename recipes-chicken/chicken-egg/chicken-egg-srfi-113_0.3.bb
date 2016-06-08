SECTION = "devel/chicken"
DESCRIPTION = "Sets and Bags."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-113.meta;md5=c69cb3046c96982f2457c8736d69d614"
DEPENDS_append_class-cross = " chicken-egg-srfi-128-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-srfi-128-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-srfi-128 chicken-egg-srfi-128-crosssdk"
DEPENDS = " chicken-egg-srfi-128 chicken-egg-srfi-128-cross"
RDEPENDS_${PN} = " chicken-egg-srfi-128"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-113/srfi-113-${PV}.tar.gz"

SRC_URI[md5sum] = "10955b326a9692e762239359210592ea"
SRC_URI[sha256sum] = "7efdab0f4a319bbf77ee3623a00327832722297fefd6753441d0b69d591df32d"

S = "${WORKDIR}/srfi-113-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
