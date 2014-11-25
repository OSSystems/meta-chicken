SECTION = "devel/chicken"
DESCRIPTION = "SQLite 3 interface"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sql-de-lite.meta;md5=97dacb83502443b8f8406ae65aefb523"
DEPENDS_append_class-cross = " chicken-egg-lru-cache-cross chicken-egg-foreigners-cross sqlite3-native"
DEPENDS_append_class-crosssdk = " chicken-egg-lru-cache-crosssdk chicken-egg-foreigners-crosssdk sqlite3-native"
DEPENDS_append_class-nativesdk = " nativesdk-sqlite3 nativesdk-chicken-egg-lru-cache nativesdk-chicken-egg-foreigners chicken-egg-lru-cache-crosssdk chicken-egg-foreigners-crosssdk"
DEPENDS = " chicken-egg-lru-cache chicken-egg-foreigners sqlite3 chicken-egg-lru-cache-cross chicken-egg-foreigners-cross"
RDEPENDS_${PN} = " chicken-egg-lru-cache chicken-egg-foreigners"

EXTRA_CHICKEN_INSTALL_OPTIONS += " -D sql-de-lite-external-lib "

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "864cb66c8aa397315142be7a7f964855"
SRC_URI[sha256sum] = "e91c8a6779cbf4533dee2ccef5dfd4349fb3767246bfa126d82fc551c5f1d940"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
