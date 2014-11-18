SECTION = "devel/chicken"
DESCRIPTION = "Manage ConnMan using the D-Bus API "
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://connman.meta;md5=8cf03ba2b573e782eb436a7126d3b9a9"
DEPENDS_virtclass-cross += "chicken-egg-dbus-cross chicken-egg-ssax-cross chicken-egg-matchable-cross chicken-egg-advice-cross"
DEPENDS += "chicken-egg-dbus chicken-egg-ssax chicken-egg-matchable chicken-egg-advice chicken-egg-dbus-cross chicken-egg-ssax-cross chicken-egg-matchable-cross chicken-egg-advice-cross"
RDEPENDS_${PN} += "chicken-egg-dbus chicken-egg-ssax chicken-egg-matchable chicken-egg-advice"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "71dc1f2342be0e6249c85f6641598d05"
SRC_URI[sha256sum] = "335f7011d759e30f4a6e668699b62d0926abb77d0ebf0afd2f2c88c9d585e9f7"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
