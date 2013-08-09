SECTION = "devel/chicken"
DESCRIPTION = "SQLite 3 interface"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sql-de-lite.meta;md5=97dacb83502443b8f8406ae65aefb523"
DEPENDS_virtclass-cross += "chicken-egg-lru-cache-cross chicken-egg-foreigners-cross"
DEPENDS += "chicken-egg-lru-cache chicken-egg-foreigners chicken-egg-lru-cache-cross chicken-egg-foreigners-cross"
RDEPENDS_${PN} += "chicken-egg-lru-cache chicken-egg-foreigners"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "666f4931331554a665b64d1e7f298a74"
SRC_URI[sha256sum] = "573464ea96d16cc1d37a2827837818a4b8bb5eec18590ec782e3f0c73c1d022b"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
