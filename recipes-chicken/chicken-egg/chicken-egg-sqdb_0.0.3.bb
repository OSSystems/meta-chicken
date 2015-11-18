SECTION = "devel/chicken"
DESCRIPTION = "Simple key-value store on top of SQLite"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://sqdb.meta;md5=eeb2b8e480f92b0ff59ba572b951fa04"
DEPENDS_append_class-cross = " chicken-egg-sql-de-lite-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-sql-de-lite-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-sql-de-lite chicken-egg-sql-de-lite-crosssdk"
DEPENDS = " chicken-egg-sql-de-lite chicken-egg-sql-de-lite-cross"
RDEPENDS_${PN} = " chicken-egg-sql-de-lite"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sqdb/sqdb-${PV}.tar.gz"

SRC_URI[md5sum] = "9c186fa286924259b4ff84cb5e1b9bd9"
SRC_URI[sha256sum] = "0776f3a3791e032fbfd8c6d9456ffb67c58de002f4c4d60f6a8996bfdfb712f7"

S = "${WORKDIR}/sqdb-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
