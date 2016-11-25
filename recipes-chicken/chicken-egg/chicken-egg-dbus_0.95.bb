SECTION = "devel/chicken"
DESCRIPTION = "A binding for libdbus, the IPC mechanism"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://dbus.meta;md5=88ae1c851bcaa33c447f62a2ab9f4806"
DEPENDS_append_class-cross = " chicken-egg-miscmacros-cross chicken-egg-foreigners-cross dbus-native"
DEPENDS_append_class-crosssdk = " chicken-egg-miscmacros-crosssdk chicken-egg-foreigners-crosssdk dbus-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-foreigners nativesdk-dbus chicken-egg-miscmacros-crosssdk chicken-egg-foreigners-crosssdk"
DEPENDS = " chicken-egg-miscmacros chicken-egg-foreigners dbus chicken-egg-miscmacros-cross chicken-egg-foreigners-cross"
RDEPENDS_${PN} = " chicken-egg-miscmacros chicken-egg-foreigners"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/dbus/dbus-${PV}.tar.gz"

SRC_URI[md5sum] = "bd64ed2cd56de358d253a14eb4e8acf9"
SRC_URI[sha256sum] = "6a8aacf228ed524bebff379d0c37b2b642224f05c5b9187ab74049e58398f3c4"

S = "${WORKDIR}/dbus-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
