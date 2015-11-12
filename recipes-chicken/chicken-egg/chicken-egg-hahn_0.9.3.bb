SECTION = "devel/chicken"
DESCRIPTION = "In-source documentation"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://hahn.meta;md5=abddc5fc1289d00bdd658018e5915b23"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/hahn/hahn-${PV}.tar.gz"

SRC_URI[md5sum] = "45345bdc985508b52b0b35869b954b59"
SRC_URI[sha256sum] = "671e2a501c3189916b74717a28af676f1f8998b130d201fb2483b0712d11a5fb"

S = "${WORKDIR}/hahn-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
