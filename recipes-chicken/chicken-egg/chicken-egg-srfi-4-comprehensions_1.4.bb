SECTION = "devel/chicken"
DESCRIPTION = "SRFI-42 Comprehensions for SRFI-4 Vectors"
LICENSE = "SRFI"
LIC_FILES_CHKSUM = "file://srfi-4-comprehensions.meta;md5=a27ea0db88e5a1d66fd6cc02ac6d561a"
DEPENDS_append_class-cross = " chicken-egg-srfi-42-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-srfi-42-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-srfi-42 chicken-egg-srfi-42-crosssdk"
DEPENDS = " chicken-egg-srfi-42 chicken-egg-srfi-42-cross"
RDEPENDS_${PN} = " chicken-egg-srfi-42"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-4-comprehensions/srfi-4-comprehensions-${PV}.tar.gz"

SRC_URI[md5sum] = "24cf82a7a9dbd64a2cef3f83a7ca1738"
SRC_URI[sha256sum] = "83a3382f8d46376bbc185600f41cf87e08861aa94e4602cd4d95ba748523d133"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
