SECTION = "devel/chicken"
DESCRIPTION = "LRU cache"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://lru-cache.meta;md5=f7cd5c281d53606c30275470bbce25a3"
DEPENDS_virtclass-cross += "chicken-egg-record-variants-cross"
DEPENDS += "chicken-egg-record-variants chicken-egg-record-variants-cross"
RDEPENDS_${PN} += "chicken-egg-record-variants"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "85fa737306eb95e06d5d0e14be47e6b3"
SRC_URI[sha256sum] = "a846265516d5e82045d469be4497ed2156ae8e371a66cf18eb496565908e19eb"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
