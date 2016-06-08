SECTION = "devel/chicken"
DESCRIPTION = "Bindings to the KiWi library"
LICENSE = "zlib"
LIC_FILES_CHKSUM = "file://kiwi.meta;md5=f1d7b6ab6036ee232dfab85492c4c39d"
DEPENDS_append_class-cross = " chicken-egg-clojurian-cross chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-clojurian-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-clojurian nativesdk-chicken-egg-matchable chicken-egg-clojurian-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-clojurian chicken-egg-matchable chicken-egg-clojurian-cross chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-clojurian chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/kiwi/kiwi-${PV}.tar.gz"

SRC_URI[md5sum] = "2028f96fe0391e76e8f846f2107300a7"
SRC_URI[sha256sum] = "18b2bdc98d8194d50fb4fd7536675ed03c3f9ea9681163250422458ac9014efe"

S = "${WORKDIR}/kiwi-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
