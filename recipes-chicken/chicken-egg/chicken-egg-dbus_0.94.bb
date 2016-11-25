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

SRC_URI[md5sum] = "092d259daa580820c16010f753d613f7"
SRC_URI[sha256sum] = "61834c22e694362f0cb1861e246297b176736b0d764e3b8bbbd15878c252cb68"

S = "${WORKDIR}/dbus-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
