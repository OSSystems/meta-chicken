SECTION = "devel/chicken"
DESCRIPTION = "sql-de-lite support for awful"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://awful-sql-de-lite.meta;md5=cedc6a2441dc8ed6a0ecc3dd0ec69ac0"
DEPENDS_append_class-cross = " chicken-egg-awful-cross chicken-egg-sql-de-lite-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-awful-crosssdk chicken-egg-sql-de-lite-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-awful nativesdk-chicken-egg-sql-de-lite chicken-egg-awful-crosssdk chicken-egg-sql-de-lite-crosssdk"
DEPENDS = " chicken-egg-awful chicken-egg-sql-de-lite chicken-egg-awful-cross chicken-egg-sql-de-lite-cross"
RDEPENDS_${PN} = " chicken-egg-awful chicken-egg-sql-de-lite"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/awful-sql-de-lite/awful-sql-de-lite-${PV}.tar.gz"

SRC_URI[md5sum] = "1369b7ac0d9ebe2b61ad2efd1d802f46"
SRC_URI[sha256sum] = "5047f21a6fb7a71bb2145538c9827e1081fc20cf3fd3209c85f44e6a4137f993"

S = "${WORKDIR}/awful-sql-de-lite-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
