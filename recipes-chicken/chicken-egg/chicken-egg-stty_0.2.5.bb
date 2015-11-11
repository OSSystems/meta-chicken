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

SRC_URI[md5sum] = "d2b97b1e83ac967a969a195a330d41ea"
SRC_URI[sha256sum] = "3356e1a8f3e63521ff837d03aeff7a6c120e19eb4393d4b26bedf0f273acf2ad"

S = "${WORKDIR}/stty-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
