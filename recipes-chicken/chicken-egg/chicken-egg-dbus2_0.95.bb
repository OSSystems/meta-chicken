SECTION = "devel/chicken"
DESCRIPTION = "A binding for libdbus, the IPC mechanism"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://dbus2.meta;md5=5506c28e008e58d902ee62e64f4a092e"
DEPENDS_append_class-cross = " chicken-egg-miscmacros-cross chicken-egg-foreigners-cross dbus-native"
DEPENDS_append_class-crosssdk = " chicken-egg-miscmacros-crosssdk chicken-egg-foreigners-crosssdk dbus-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-foreigners nativesdk-dbus chicken-egg-miscmacros-crosssdk chicken-egg-foreigners-crosssdk"
DEPENDS = " chicken-egg-miscmacros chicken-egg-foreigners dbus chicken-egg-miscmacros-cross chicken-egg-foreigners-cross"
RDEPENDS_${PN} = " chicken-egg-miscmacros chicken-egg-foreigners"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/dbus2/dbus2-${PV}.tar.gz"

SRC_URI[md5sum] = "9e6f129d23cdf0e7956bbbf0c9ff9363"
SRC_URI[sha256sum] = "8412e1913737170e3c0a94acdaacaad4bc546ac7f7f74b7dbf9e17847b830305"

S = "${WORKDIR}/dbus2-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
