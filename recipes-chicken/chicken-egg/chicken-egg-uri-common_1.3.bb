SECTION = "devel/chicken"
DESCRIPTION = "Parser for common URI schemes"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://uri-common.meta;md5=3a68c19704242347487cce53495c1dc8"
DEPENDS_virtclass-cross += "chicken-egg-uri-generic-cross chicken-egg-defstruct-cross chicken-egg-matchable-cross"
DEPENDS += "chicken-egg-uri-generic chicken-egg-defstruct chicken-egg-matchable chicken-egg-uri-generic-cross chicken-egg-defstruct-cross chicken-egg-matchable-cross"
RDEPENDS_${PN} += "chicken-egg-uri-generic chicken-egg-defstruct chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "aa9610ccd2992619bcc06d9678fe514e"
SRC_URI[sha256sum] = "a5399917eacb950211a5c5cdd3ca6003d54d81815cf8d309e766cfb805d9d8df"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
