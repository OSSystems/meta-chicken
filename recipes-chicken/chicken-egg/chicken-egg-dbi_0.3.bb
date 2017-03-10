SECTION = "devel/chicken"
DESCRIPTION = "An abstract database interface."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://dbi.meta;md5=abd34475588fe8c75d2c6d0ada7ca4e2"
DEPENDS_append_class-cross = " chicken-egg-autoload-cross chicken-egg-sql-null-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-autoload-crosssdk chicken-egg-sql-null-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-autoload nativesdk-chicken-egg-sql-null chicken-egg-autoload-crosssdk chicken-egg-sql-null-crosssdk"
DEPENDS = " chicken-egg-autoload chicken-egg-sql-null chicken-egg-autoload-cross chicken-egg-sql-null-cross"
RDEPENDS_${PN} = " chicken-egg-autoload chicken-egg-sql-null"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/dbi/dbi-${PV}.tar.gz"

SRC_URI[md5sum] = "cb9b58b9907d34e44574580f751fbdd4"
SRC_URI[sha256sum] = "02dbebb0b5e5798fa4cc35d33cffb45aed5767c9728ff2e4e93c59e39e09346e"

S = "${WORKDIR}/dbi-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
