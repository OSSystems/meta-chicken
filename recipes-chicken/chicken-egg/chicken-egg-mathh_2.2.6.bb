SECTION = "devel/chicken"
DESCRIPTION = "ISO C math functions and constants"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://mathh.meta;md5=bc82eb022e9d104240ac891b46bce800"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/mathh/mathh-${PV}.tar.gz"

SRC_URI[md5sum] = "56a62fc07c07176fedab156a51b80b42"
SRC_URI[sha256sum] = "f4b6cf0cac83ba169ff00b8e152929b3a849bd376a94aeb7a2276ea85fd12569"

S = "${WORKDIR}/mathh-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
