SECTION = "devel/chicken"
DESCRIPTION = "sql-de-lite support for awful"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://awful-sql-de-lite.meta;md5=1187d16bc4c38d5fb10fce75abfe33ec"
DEPENDS_virtclass-cross += "chicken-egg-awful-cross chicken-egg-sql-de-lite-cross"
DEPENDS += "chicken-egg-awful chicken-egg-sql-de-lite chicken-egg-awful-cross chicken-egg-sql-de-lite-cross"
RDEPENDS_${PN} += "chicken-egg-awful chicken-egg-sql-de-lite"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "70e03c8a2638ff8de369b13603e95441"
SRC_URI[sha256sum] = "ded74bb6fa49ad19a4eb63b85bb52920ca06ddae9dbdbd65c8ba2f51929a4482"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
