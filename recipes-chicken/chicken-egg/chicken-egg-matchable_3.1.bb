SECTION = "devel/chicken"
DESCRIPTION = "Hygienic MATCH replacement"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://matchable.meta;md5=3a6be0a7340eb32dbb69048656813be2"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "73c1736b7ed66fc214dbee0169899191"
SRC_URI[sha256sum] = "6297d2cb1521457292634bb95b6834154dae898cefbc7152c60b0c5e511e1b24"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
