SECTION = "devel/chicken"
DESCRIPTION = "stty-style interface to termios"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://stty.meta;md5=5d50ca9c782c7465272fc8c7a4ee08e6"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-foreigners-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-foreigners-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-foreigners chicken-egg-setup-helper-crosssdk chicken-egg-foreigners-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-foreigners chicken-egg-setup-helper-cross chicken-egg-foreigners-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-foreigners"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/stty/stty-${PV}.tar.gz"

SRC_URI[md5sum] = "372d43061b73d7f28ab22fd7abe29392"
SRC_URI[sha256sum] = "9fbc74f8c3e513ff32abfe02aeea7a8b17997a5ad17190023483cae6ff6b46e9"

S = "${WORKDIR}/stty-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
