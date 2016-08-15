SECTION = "devel/chicken"
DESCRIPTION = "Design by contract for procedures"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://simple-contracts.meta;md5=3d8d29b106d9ce5b47d0cb3e1b9bbc6e"
DEPENDS_append_class-cross = " chicken-egg-simple-exceptions-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-simple-exceptions-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-simple-exceptions chicken-egg-simple-exceptions-crosssdk"
DEPENDS = " chicken-egg-simple-exceptions chicken-egg-simple-exceptions-cross"
RDEPENDS_${PN} = " chicken-egg-simple-exceptions"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/simple-contracts/simple-contracts-${PV}.tar.gz"

SRC_URI[md5sum] = "3b607a6c3e3bfc8e87fc4ff6db0168e3"
SRC_URI[sha256sum] = "abc7a03e46635df48e337fa401b516e525e869c8c1bb53d02e244fc34b62e9d1"

S = "${WORKDIR}/simple-contracts-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
