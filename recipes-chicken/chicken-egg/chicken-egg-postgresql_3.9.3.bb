SECTION = "devel/chicken"
DESCRIPTION = "Bindings for PostgreSQL's C-api"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://postgresql.meta;md5=632e19ebb59f850e6a830dec556d380b"
DEPENDS_append_class-cross = " chicken-egg-sql-null-cross postgresql-native"
DEPENDS_append_class-crosssdk = " chicken-egg-sql-null-crosssdk postgresql-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-sql-null nativesdk-postgresql chicken-egg-sql-null-crosssdk"
DEPENDS = " chicken-egg-sql-null postgresql chicken-egg-sql-null-cross"
RDEPENDS_${PN} = " chicken-egg-sql-null"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/postgresql/postgresql-${PV}.tar.gz"

SRC_URI[md5sum] = "a61d29c800196d0635c0ee3ac6aec217"
SRC_URI[sha256sum] = "a62a0e681a14c30f4274da80350399c3af7cbbd025f685a237f1e87924a1f6de"

S = "${WORKDIR}/postgresql-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
