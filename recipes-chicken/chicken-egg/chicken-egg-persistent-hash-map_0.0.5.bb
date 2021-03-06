SECTION = "devel/chicken"
DESCRIPTION = "A persistent (as in immutable) hash map implementation."
LICENSE = "EPL-1.0"
LIC_FILES_CHKSUM = "file://persistent-hash-map.meta;md5=3023cb5a032ca3ff10c99d6ee0203d4b"
DEPENDS_append_class-cross = " chicken-egg-fast-generic-cross chicken-egg-clojurian-cross chicken-egg-typed-records-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-fast-generic-crosssdk chicken-egg-clojurian-crosssdk chicken-egg-typed-records-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-fast-generic nativesdk-chicken-egg-clojurian nativesdk-chicken-egg-typed-records chicken-egg-fast-generic-crosssdk chicken-egg-clojurian-crosssdk chicken-egg-typed-records-crosssdk"
DEPENDS = " chicken-egg-fast-generic chicken-egg-clojurian chicken-egg-typed-records chicken-egg-fast-generic-cross chicken-egg-clojurian-cross chicken-egg-typed-records-cross"
RDEPENDS_${PN} = " chicken-egg-fast-generic chicken-egg-clojurian chicken-egg-typed-records"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/persistent-hash-map/persistent-hash-map-${PV}.tar.gz"

SRC_URI[md5sum] = "e5310d7542418b645b58f93a08c355b8"
SRC_URI[sha256sum] = "28ab765c4b02c3d4b2aa6db263ecca4b28613dab3da016906f95eb256e5fc031"

S = "${WORKDIR}/persistent-hash-map-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
