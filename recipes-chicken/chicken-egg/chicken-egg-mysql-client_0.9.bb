SECTION = "devel/chicken"
DESCRIPTION = "A MySQL client library."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://mysql-client.meta;md5=11a1242ed026514612c0c734423454f6"
DEPENDS_append_class-cross = " mariadb-native"
DEPENDS_append_class-crosssdk = " mariadb-native"
DEPENDS_append_class-nativesdk = " nativesdk-mariadb"
DEPENDS = " mariadb"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/mysql-client/mysql-client-${PV}.tar.gz"

SRC_URI[md5sum] = "7e369281a9431141adb431f06caf1fea"
SRC_URI[sha256sum] = "bf42883e4dcf95130e74bca79d3570a631e2c6453cb62f134fab09042dfab289"

S = "${WORKDIR}/mysql-client-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
