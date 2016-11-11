SECTION = "devel/chicken"
DESCRIPTION = "A binding for libdbus, the IPC mechanism"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://dbus2.meta;md5=b0660386cc0b6e79481d316383953ca2"
DEPENDS_append_class-cross = " chicken-egg-easyffi-cross chicken-egg-matchable-cross chicken-egg-miscmacros-cross chicken-egg-foreigners-cross dbus-native"
DEPENDS_append_class-crosssdk = " chicken-egg-easyffi-crosssdk chicken-egg-matchable-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-foreigners-crosssdk dbus-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-easyffi nativesdk-chicken-egg-matchable nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-foreigners nativesdk-dbus chicken-egg-easyffi-crosssdk chicken-egg-matchable-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-foreigners-crosssdk"
DEPENDS = " chicken-egg-easyffi chicken-egg-matchable chicken-egg-miscmacros chicken-egg-foreigners dbus chicken-egg-easyffi-cross chicken-egg-matchable-cross chicken-egg-miscmacros-cross chicken-egg-foreigners-cross"
RDEPENDS_${PN} = " chicken-egg-easyffi chicken-egg-matchable chicken-egg-miscmacros chicken-egg-foreigners"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/dbus2/dbus2-${PV}.tar.gz"

SRC_URI[md5sum] = "c7d1804248377fc14949826afd5c9e7c"
SRC_URI[sha256sum] = "fa5ea594bcf471a9bc3f66b423bdfab205e981d87ea3b624eae00791e7567589"

S = "${WORKDIR}/dbus2-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
