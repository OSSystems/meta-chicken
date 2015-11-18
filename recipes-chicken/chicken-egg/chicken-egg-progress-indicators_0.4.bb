SECTION = "devel/chicken"
DESCRIPTION = "text-mode progress-indicators"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://progress-indicators.meta;md5=da1cd83621debc333989131c34f8ad29"
DEPENDS_append_class-cross = " chicken-egg-defstruct-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-defstruct-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-defstruct chicken-egg-defstruct-crosssdk"
DEPENDS = " chicken-egg-defstruct chicken-egg-defstruct-cross"
RDEPENDS_${PN} = " chicken-egg-defstruct"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/progress-indicators/progress-indicators-${PV}.tar.gz"

SRC_URI[md5sum] = "ae8e76190569da5cbba2d0f7119f853f"
SRC_URI[sha256sum] = "d263156ce64d13095d5695daeb627bc9f0be0961edbe44c5725acb7374269ee0"

S = "${WORKDIR}/progress-indicators-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
