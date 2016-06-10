SECTION = "devel/chicken"
DESCRIPTION = "A simple 2D and 3D graphics library for X11"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://ezxdisp.meta;md5=b9fe2ecb64f89b77d968b9e9d7f27608"
DEPENDS_append_class-cross = " chicken-egg-easyffi-cross libx11-native"
DEPENDS_append_class-crosssdk = " chicken-egg-easyffi-crosssdk libx11-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-easyffi nativesdk-chicken-egg-libx11 chicken-egg-easyffi-crosssdk"
DEPENDS = " chicken-egg-easyffi libx11 chicken-egg-easyffi-cross"
RDEPENDS_${PN} = " chicken-egg-easyffi"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/ezxdisp/ezxdisp-${PV}.tar.gz"

SRC_URI[md5sum] = "e62ab555f30a83cca343a2f5f3994964"
SRC_URI[sha256sum] = "0181ad3e4f8deb63e254fcbcd788a6e538ab32e40938a58a78aa6fe2ac51af5d"

S = "${WORKDIR}/ezxdisp-${PV}"

require chicken-egg-ezxdisp.inc

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
