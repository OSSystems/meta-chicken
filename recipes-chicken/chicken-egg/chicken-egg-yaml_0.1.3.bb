SECTION = "devel/chicken"
DESCRIPTION = "Bindings to libyaml"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://yaml.meta;md5=ec6c9c1e11fa19cce6da128b377be99c"
DEPENDS_append_class-cross = " chicken-egg-sql-null-cross libyaml-native"
DEPENDS_append_class-crosssdk = " chicken-egg-sql-null-crosssdk libyaml-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-sql-null nativesdk-libyaml chicken-egg-sql-null-crosssdk"
DEPENDS = " chicken-egg-sql-null libyaml chicken-egg-sql-null-cross"
RDEPENDS_${PN} = " chicken-egg-sql-null"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/yaml/yaml-${PV}.tar.gz"

SRC_URI[md5sum] = "f1bf9c393484768ba53a50ebeb137e43"
SRC_URI[sha256sum] = "951b043844d52bd31860e39c5dfb6c1283792b9fa3a60ebab42e09c6e8e8aabc"

S = "${WORKDIR}/yaml-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
