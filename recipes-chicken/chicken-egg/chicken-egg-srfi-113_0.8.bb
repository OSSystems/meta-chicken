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

SRC_URI[md5sum] = "ac84283af4f5688b3305d905321aad9a"
SRC_URI[sha256sum] = "f4aabf00f6f21b0bc0ca356b73109951e9e3f298f3667fcde9fcd3c66f79a274"

S = "${WORKDIR}/srfi-113-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
