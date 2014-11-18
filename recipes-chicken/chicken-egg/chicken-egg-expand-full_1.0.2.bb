SECTION = "devel/chicken"
DESCRIPTION = "Full macro expansion"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://expand-full.meta;md5=2f9e841945892461c7e390e5a81d17ea"
DEPENDS_virtclass-cross += "chicken-egg-setup-helper-cross"
DEPENDS += "chicken-egg-setup-helper chicken-egg-setup-helper-cross"
RDEPENDS_${PN} += "chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "318b87dcc8ce078671f03b4e7f0e16a0"
SRC_URI[sha256sum] = "7e05ac285047410407dd6435d3217aca4b3e3474e0e21bb0a14a2261c479add9"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
