SECTION = "devel/chicken"
DESCRIPTION = "Brute-force include for multi-file programs"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://inclub.meta;md5=9b8f46b4f7bfd97583fef1ec4e7c5b11"
DEPENDS_append_class-cross = " chicken-egg-filepath-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-filepath-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-filepath chicken-egg-filepath-crosssdk"
DEPENDS = " chicken-egg-filepath chicken-egg-filepath-cross"
RDEPENDS_${PN} = " chicken-egg-filepath"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/inclub/inclub-${PV}.tar.gz"

SRC_URI[md5sum] = "f822bf1f9c59220b79e134dd915c4817"
SRC_URI[sha256sum] = "87fe6d1331af7616c235e8577a763a6110b461b48815e925880df7d6fedeb40a"

S = "${WORKDIR}/inclub-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
