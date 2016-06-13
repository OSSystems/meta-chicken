SECTION = "devel/chicken"
DESCRIPTION = "srfi-9-ext"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-9-ext.meta;md5=a6baaec4c008b98562dc5249956ae64d"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-9-ext/srfi-9-ext-${PV}.tar.gz"

SRC_URI[md5sum] = "58d4e0cead3adc16f0f441c775fe50c8"
SRC_URI[sha256sum] = "2e18d877cd799d9b16f0f19b9de1ffa186f4eeb6e3ff7f733588bac935f72b4d"

S = "${WORKDIR}/srfi-9-ext-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
