SECTION = "devel/chicken"
DESCRIPTION = "Invoke callbacks from other native threads"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://concurrent-native-callbacks.meta;md5=000b48a849df7d33bbf084a0b2757188"
DEPENDS_append_class-cross = " chicken-egg-typed-records-cross chicken-egg-matchable-cross chicken-egg-bind-cross chicken-egg-miscmacros-cross chicken-egg-shell-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-typed-records-crosssdk chicken-egg-matchable-crosssdk chicken-egg-bind-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-shell-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-typed-records nativesdk-chicken-egg-matchable nativesdk-chicken-egg-bind nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-shell chicken-egg-typed-records-crosssdk chicken-egg-matchable-crosssdk chicken-egg-bind-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-shell-crosssdk"
DEPENDS = " chicken-egg-typed-records chicken-egg-matchable chicken-egg-bind chicken-egg-miscmacros chicken-egg-shell chicken-egg-typed-records-cross chicken-egg-matchable-cross chicken-egg-bind-cross chicken-egg-miscmacros-cross chicken-egg-shell-cross chicken-egg-concurrent-native-callbacks-cross"
RDEPENDS_${PN} = " chicken-egg-typed-records chicken-egg-matchable chicken-egg-bind chicken-egg-miscmacros chicken-egg-shell"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/concurrent-native-callbacks/concurrent-native-callbacks-${PV}.tar.gz"

SRC_URI[md5sum] = "b08bd467da7761297790d58092d3bce9"
SRC_URI[sha256sum] = "0570cadf813132d04caf624a627de229879ecbf1ad87d1428907f80e32329894"

S = "${WORKDIR}/concurrent-native-callbacks-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
