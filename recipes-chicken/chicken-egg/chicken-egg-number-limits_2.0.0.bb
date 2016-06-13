SECTION = "devel/chicken"
DESCRIPTION = "Limit constants for numbers"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://number-limits.meta;md5=40155681afc14126c7bd33f1475df30c"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/number-limits/number-limits-${PV}.tar.gz"

SRC_URI[md5sum] = "3b5977a989bceba4c1680695e5553aea"
SRC_URI[sha256sum] = "6bec4eb07b463f0285875b535e990bba4e30837b37a5d3c13c65a0f86c5f6b1a"

S = "${WORKDIR}/number-limits-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
