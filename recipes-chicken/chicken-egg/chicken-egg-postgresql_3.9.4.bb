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

SRC_URI[md5sum] = "8cc08572940886a88398f979371d4d86"
SRC_URI[sha256sum] = "972205a0c66dc4cf827a19e77d1e018f2064a3a37824da70a994d7406cc3b016"

S = "${WORKDIR}/postgresql-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
