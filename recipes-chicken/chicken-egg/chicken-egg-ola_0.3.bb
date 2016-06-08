SECTION = "devel/chicken"
DESCRIPTION = "bindings for libola"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://ola.meta;md5=0885305d5efe7d645ad0f0cc2124b40a"
DEPENDS_append_class-cross = " chicken-egg-r7rs-cross chicken-egg-srfi-99-cross chicken-egg-foreigners-cross chicken-egg-list-utils-cross chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-r7rs-crosssdk chicken-egg-srfi-99-crosssdk chicken-egg-foreigners-crosssdk chicken-egg-list-utils-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-r7rs nativesdk-chicken-egg-srfi-99 nativesdk-chicken-egg-foreigners nativesdk-chicken-egg-list-utils nativesdk-chicken-egg-matchable chicken-egg-r7rs-crosssdk chicken-egg-srfi-99-crosssdk chicken-egg-foreigners-crosssdk chicken-egg-list-utils-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-r7rs chicken-egg-srfi-99 chicken-egg-foreigners chicken-egg-list-utils chicken-egg-matchable chicken-egg-r7rs-cross chicken-egg-srfi-99-cross chicken-egg-foreigners-cross chicken-egg-list-utils-cross chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-r7rs chicken-egg-srfi-99 chicken-egg-foreigners chicken-egg-list-utils chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/ola/ola-${PV}.tar.gz"

SRC_URI[md5sum] = "b8df17b28dfca867b15501c99d90d681"
SRC_URI[sha256sum] = "16dd4fcdafe8ea3c21b1cf5594af4e6ff3c600c99eccc9d9e2f323a9c6d3afb1"

S = "${WORKDIR}/ola-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
