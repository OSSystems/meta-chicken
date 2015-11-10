SECTION = "devel/chicken"
DESCRIPTION = "SQLite 3 interface"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sql-de-lite.meta;md5=97dacb83502443b8f8406ae65aefb523"
DEPENDS_append_class-cross = " chicken-egg-lru-cache-cross chicken-egg-foreigners-cross sqlite3-native"
DEPENDS_append_class-crosssdk = " chicken-egg-lru-cache-crosssdk chicken-egg-foreigners-crosssdk sqlite3-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-lru-cache nativesdk-chicken-egg-foreigners chicken-egg-lru-cache-crosssdk chicken-egg-foreigners-crosssdk"
DEPENDS = " chicken-egg-lru-cache chicken-egg-foreigners sqlite3 chicken-egg-lru-cache-cross chicken-egg-foreigners-cross"
RDEPENDS_${PN} = " chicken-egg-lru-cache chicken-egg-foreigners"

EXTRA_CHICKEN_INSTALL_OPTIONS += " -D sql-de-lite-external-lib "

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sql-de-lite/sql-de-lite-${PV}.tar.gz"

SRC_URI[md5sum] = "6b1a6a3c5f0ea3bd9d25f8ae3863724d"
SRC_URI[sha256sum] = "35d35e52408327bb4890f5dffbda0f7b13aeb14676169853efc7370ad82657ca"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
