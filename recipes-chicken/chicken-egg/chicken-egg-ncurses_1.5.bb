SECTION = "devel/chicken"
DESCRIPTION = "An interface to the UNIX ncurses package"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://ncurses.meta;md5=487c84b3640da0311401e48a0ffd8653"
DEPENDS_append_class-cross = " chicken-egg-easyffi-cross ncurses-native"
DEPENDS_append_class-crosssdk = " chicken-egg-easyffi-crosssdk ncurses-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-easyffi chicken-egg-easyffi-crosssdk"
DEPENDS = " chicken-egg-easyffi ncurses chicken-egg-easyffi-cross"
RDEPENDS_${PN} = " chicken-egg-easyffi"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/ncurses/ncurses-${PV}.tar.gz"

SRC_URI[md5sum] = "4a5bf65ad6f6bfcfe0fdd6bcd1398ec5"
SRC_URI[sha256sum] = "96793e502c4be8e87942e77ff88908b749f64c3af82d217348c929b6e7310910"

S = "${WORKDIR}/ncurses-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
