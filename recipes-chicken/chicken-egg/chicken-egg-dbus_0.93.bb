SECTION = "devel/chicken"
DESCRIPTION = "A binding for libdbus, the IPC mechanism"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://dbus.meta;md5=896e5ddc25aac26d51da6b7b36c62897"
DEPENDS_append_class-cross = " chicken-egg-easyffi-cross chicken-egg-matchable-cross chicken-egg-miscmacros-cross chicken-egg-foreigners-cross dbus-native"
DEPENDS_append_class-crosssdk = " chicken-egg-easyffi-crosssdk chicken-egg-matchable-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-foreigners-crosssdk dbus-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-easyffi nativesdk-chicken-egg-matchable nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-foreigners chicken-egg-easyffi-crosssdk chicken-egg-matchable-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-foreigners-crosssdk"
DEPENDS = " chicken-egg-easyffi chicken-egg-matchable chicken-egg-miscmacros chicken-egg-foreigners dbus chicken-egg-easyffi-cross chicken-egg-matchable-cross chicken-egg-miscmacros-cross chicken-egg-foreigners-cross"
RDEPENDS_${PN} = " chicken-egg-easyffi chicken-egg-matchable chicken-egg-miscmacros chicken-egg-foreigners"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/dbus/dbus-${PV}.tar.gz file://dbus-error-handling.patch"

SRC_URI[md5sum] = "f0f8f0482f425258f9c27724991a297b"
SRC_URI[sha256sum] = "81c86dbcc7d6501d867c175aea3d313fcb272f1b51582d5d42f527e28714b992"

S = "${WORKDIR}/dbus-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
