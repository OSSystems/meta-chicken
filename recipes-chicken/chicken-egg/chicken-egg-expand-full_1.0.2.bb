SECTION = "devel/chicken"
DESCRIPTION = "Full macro expansion"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://expand-full.meta;md5=2f9e841945892461c7e390e5a81d17ea"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/expand-full/expand-full-${PV}.tar.gz"

SRC_URI[md5sum] = "318b87dcc8ce078671f03b4e7f0e16a0"
SRC_URI[sha256sum] = "7e05ac285047410407dd6435d3217aca4b3e3474e0e21bb0a14a2261c479add9"

S = "${WORKDIR}/expand-full-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
