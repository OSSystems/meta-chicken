SECTION = "devel/chicken"
DESCRIPTION = "A binding for libdbus, the IPC mechanism"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://dbus.meta;md5=896e5ddc25aac26d51da6b7b36c62897"
DEPENDS_append_class-cross = " chicken-egg-easyffi-cross chicken-egg-matchable-cross chicken-egg-miscmacros-cross chicken-egg-foreigners-cross dbus-native"
DEPENDS_append_class-crosssdk = " chicken-egg-easyffi-crosssdk chicken-egg-matchable-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-foreigners-crosssdk dbus-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-easyffi nativesdk-chicken-egg-matchable nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-foreigners nativesdk-dbus chicken-egg-easyffi-crosssdk"
DEPENDS = "chicken-egg-easyffi chicken-egg-matchable chicken-egg-miscmacros chicken-egg-foreigners dbus chicken-egg-easyffi-cross chicken-egg-matchable-cross chicken-egg-miscmacros-cross chicken-egg-foreigners-cross"
RDEPENDS_${PN} = "chicken-egg-easyffi chicken-egg-matchable chicken-egg-miscmacros chicken-egg-foreigners"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz file://dbus-error-handling.patch"

SRC_URI[md5sum] = "cedbdb970aecb940b42b910c4743342b"
SRC_URI[sha256sum] = "0b10d4aa4f4f9c285cb80af3b951ac50791fa99db7a2c1d86f1312153f5bbe93"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
