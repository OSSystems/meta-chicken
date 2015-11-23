SECTION = "devel/chicken"
DESCRIPTION = "Bindings to libyaml"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://yaml.meta;md5=ec6c9c1e11fa19cce6da128b377be99c"
DEPENDS_append_class-cross = " chicken-egg-sql-null-cross libyaml-native"
DEPENDS_append_class-crosssdk = " chicken-egg-sql-null-crosssdk libyaml-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-sql-null chicken-egg-sql-null-crosssdk"
DEPENDS = " chicken-egg-sql-null libyaml chicken-egg-sql-null-cross"
RDEPENDS_${PN} = " chicken-egg-sql-null"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/yaml/yaml-${PV}.tar.gz"

SRC_URI[md5sum] = "e71a1666fb33fd406d05fdd0a6da5000"
SRC_URI[sha256sum] = "cbb4260af9a0cb18e1a0740105ec82a5cacd1819dbed916bd5c7e593ffbb158a"

S = "${WORKDIR}/yaml-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
