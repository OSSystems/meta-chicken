SECTION = "devel/chicken"
DESCRIPTION = "stty-style interface to termios"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://stty.meta;md5=5d50ca9c782c7465272fc8c7a4ee08e6"
DEPENDS_virtclass-cross += "chicken-egg-setup-helper-cross chicken-egg-foreigners-cross"
DEPENDS += "chicken-egg-setup-helper chicken-egg-foreigners chicken-egg-setup-helper-cross chicken-egg-foreigners-cross"
RDEPENDS_${PN} += "chicken-egg-setup-helper chicken-egg-foreigners"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "19288b78eb84399b69dd252d33295a78"
SRC_URI[sha256sum] = "54aa91ef513d3bbce2831b7620c8951facfeb3a662af8bcc8faba24220275572"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
