SECTION = "devel/chicken"
DESCRIPTION = "fast-generic functions"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://fast-generic.meta;md5=ff5d32d4d42d8a0ab9eed1229e5b70de"
DEPENDS_class-cross += "chicken-egg-matchable-cross"
DEPENDS += "chicken-egg-matchable chicken-egg-matchable-cross chicken-egg-fast-generic-cross"
RDEPENDS_${PN} += "chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "1d30f9e974b81e458838381fb258f8c0"
SRC_URI[sha256sum] = "926fee1e073dc645cab0e42f7d074f1436036c001f59f61e3bfe198c08cfde47"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
