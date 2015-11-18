SECTION = "devel/chicken"
DESCRIPTION = "Implicit-renaming macros with pattern matching"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://ir-macros.meta;md5=42360319f9b3b65242fae538172b9809"
DEPENDS_append_class-cross = " chicken-egg-contracts-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-contracts-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-contracts chicken-egg-contracts-crosssdk"
DEPENDS = " chicken-egg-contracts chicken-egg-contracts-cross"
RDEPENDS_${PN} = " chicken-egg-contracts"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/ir-macros/ir-macros-${PV}.tar.gz"

SRC_URI[md5sum] = "bb62831b9a7c59dd7be7ee5db3d95970"
SRC_URI[sha256sum] = "fc4f2933c1d754177cf627f1c370f2f8f520a1d57d5563b24726f7f061aec32e"

S = "${WORKDIR}/ir-macros-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
