SECTION = "devel/chicken"
DESCRIPTION = "SRFI 101"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-101.meta;md5=dd287a91fd4d2d57e6429f60ef757192"
DEPENDS_append_class-cross = " chicken-egg-vector-lib-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-vector-lib-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-vector-lib chicken-egg-vector-lib-crosssdk"
DEPENDS = " chicken-egg-vector-lib chicken-egg-vector-lib-cross chicken-egg-srfi-101-cross"
RDEPENDS_${PN} = " chicken-egg-vector-lib"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-101/srfi-101-${PV}.tar.gz"

SRC_URI[md5sum] = "c55bf013847baba25a475c98a6fb23b3"
SRC_URI[sha256sum] = "fd80dcd43dc05d7cf79079140b685491a4e738dd5083ccde31269235f3e46b0f"

S = "${WORKDIR}/srfi-101-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
