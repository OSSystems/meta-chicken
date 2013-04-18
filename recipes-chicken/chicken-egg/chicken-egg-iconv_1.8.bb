SECTION = "devel/chicken"
DESCRIPTION = "Character-set conversions"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://iconv.meta;md5=7f992342008dd28bab15d032bd6776ef"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "7815ac62099dd2ebde864989b6cac5e1"
SRC_URI[sha256sum] = "71643c150710fd463c3b07ae6b770a6ef4f64ca8842290208f9dbc58d1cf2f16"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
