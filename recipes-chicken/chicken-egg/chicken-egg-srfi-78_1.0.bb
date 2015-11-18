SECTION = "devel/chicken"
DESCRIPTION = "SRFI-78: Lightweight testing"
LICENSE = "SRFI"
LIC_FILES_CHKSUM = "file://srfi-78.meta;md5=5919da951a298ee89edcbdd60e285e45"
DEPENDS_append_class-cross = " chicken-egg-srfi-42-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-srfi-42-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-srfi-42 chicken-egg-srfi-42-crosssdk"
DEPENDS = " chicken-egg-srfi-42 chicken-egg-srfi-42-cross"
RDEPENDS_${PN} = " chicken-egg-srfi-42"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-78/srfi-78-${PV}.tar.gz"

SRC_URI[md5sum] = "0a071156c8c85a5076d09cfe1c5978a2"
SRC_URI[sha256sum] = "1e2a6fbb40fe0f25eff74786e1119493b695dc68a1a746d4a25800f8b15d5803"

S = "${WORKDIR}/srfi-78-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
