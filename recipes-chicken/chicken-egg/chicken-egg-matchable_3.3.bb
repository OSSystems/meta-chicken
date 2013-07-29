SECTION = "devel/chicken"
DESCRIPTION = "Hygienic MATCH replacement"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://matchable.meta;md5=731971e07eada4dea4e6b90eab16f7b7"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "88f3611fd3484ad4c9f256485e9d0e45"
SRC_URI[sha256sum] = "ef431aa96af656a2a741976587379e67d768eec5b43d8e90ca6ed9e441a3a761"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
