SECTION = "devel/chicken"
DESCRIPTION = "A binding for libdbus, the IPC mechanism"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://dbus.meta;md5=cf4fb2752bb0ad149bf1bba956cccf07"
DEPENDS_virtclass-cross += "chicken-egg-easyffi-cross chicken-egg-protobj-cross chicken-egg-matchable-cross chicken-egg-miscmacros-cross chicken-egg-foreigners-cross dbus-native"
DEPENDS += "chicken-egg-easyffi chicken-egg-protobj chicken-egg-matchable chicken-egg-miscmacros chicken-egg-foreigners dbus chicken-egg-easyffi-cross chicken-egg-protobj-cross chicken-egg-matchable-cross chicken-egg-miscmacros-cross chicken-egg-foreigners-cross"
RDEPENDS += "chicken-egg-easyffi chicken-egg-protobj chicken-egg-matchable chicken-egg-miscmacros chicken-egg-foreigners"

inherit chicken_install

BBCLASSEXTEND = "cross"
