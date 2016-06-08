SECTION = "devel/chicken"
DESCRIPTION = "An interface to the UNIX ncurses package"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://ncurses.meta;md5=243bcfa98c69c77df8e3cd0f1c41f96d"
DEPENDS_append_class-cross = " chicken-egg-easyffi-cross ncurses-native"
DEPENDS_append_class-crosssdk = " chicken-egg-easyffi-crosssdk ncurses-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-easyffi chicken-egg-easyffi-crosssdk"
DEPENDS = " chicken-egg-easyffi ncurses chicken-egg-easyffi-cross"
RDEPENDS_${PN} = " chicken-egg-easyffi"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/ncurses/ncurses-${PV}.tar.gz"

SRC_URI[md5sum] = "c72d6545b02d68aa7bcaeebe46ca0938"
SRC_URI[sha256sum] = "14f3e4afa3c09fd54ffbaede0dcbebe67a83d90beb6c49b9ffc6cea49183358d"

S = "${WORKDIR}/ncurses-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
