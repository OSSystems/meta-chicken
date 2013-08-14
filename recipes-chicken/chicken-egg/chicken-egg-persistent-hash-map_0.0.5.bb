SECTION = "devel/chicken"
DESCRIPTION = "A persistent (as in immutable) hash map implementation."
LICENSE = "EPL-1.0"
LIC_FILES_CHKSUM = "file://persistent-hash-map.meta;md5=3023cb5a032ca3ff10c99d6ee0203d4b"
DEPENDS_virtclass-cross += "chicken-egg-fast-generic-cross chicken-egg-clojurian-cross chicken-egg-typed-records-cross"
DEPENDS += "chicken-egg-fast-generic chicken-egg-clojurian chicken-egg-typed-records chicken-egg-fast-generic-cross chicken-egg-clojurian-cross chicken-egg-typed-records-cross"
RDEPENDS_${PN} += "chicken-egg-fast-generic chicken-egg-clojurian chicken-egg-typed-records"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "e5310d7542418b645b58f93a08c355b8"
SRC_URI[sha256sum] = "28ab765c4b02c3d4b2aa6db263ecca4b28613dab3da016906f95eb256e5fc031"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
