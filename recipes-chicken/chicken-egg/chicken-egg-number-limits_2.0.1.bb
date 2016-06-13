SECTION = "devel/chicken"
DESCRIPTION = "Limit constants for numbers"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://number-limits.meta;md5=75a78eea6c64c7274b682901037d66ed"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/number-limits/number-limits-${PV}.tar.gz"

SRC_URI[md5sum] = "6666f16d54c0f0cc98825cc0d56ba895"
SRC_URI[sha256sum] = "dc8b468c8bfce578a2802c23acb9cc77b97944cead6ca90a0749b49cf4079ef9"

S = "${WORKDIR}/number-limits-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
