SECTION = "devel/chicken"
DESCRIPTION = "A binding for libdbus, the IPC mechanism"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://dbus.meta;md5=896e5ddc25aac26d51da6b7b36c62897"
DEPENDS_virtclass-cross += "chicken-egg-easyffi-cross chicken-egg-matchable-cross chicken-egg-miscmacros-cross chicken-egg-foreigners-cross dbus-native"
DEPENDS += "chicken-egg-easyffi chicken-egg-matchable chicken-egg-miscmacros chicken-egg-foreigners dbus chicken-egg-easyffi-cross chicken-egg-matchable-cross chicken-egg-miscmacros-cross chicken-egg-foreigners-cross"
RDEPENDS_${PN} += "chicken-egg-easyffi chicken-egg-matchable chicken-egg-miscmacros chicken-egg-foreigners"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "87f22261812aac8a13482a718a45adb2"
SRC_URI[sha256sum] = "21b785a0d7e32ee016bf0eb43326074f343bddc4cbe3ab477f823f2957e720e4"

S = "${WORKDIR}/${EGG}-${PV}"
PR = "r1"

SRC_URI += "file://ossystems-changes.patch"

inherit chicken_install

BBCLASSEXTEND = "cross"
