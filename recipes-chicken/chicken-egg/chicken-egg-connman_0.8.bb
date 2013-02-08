SECTION = "devel/chicken"
DESCRIPTION = "Manage ConnMan using the D-Bus API "
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://connman.meta;md5=8cf03ba2b573e782eb436a7126d3b9a9"
DEPENDS_virtclass-cross += "chicken-egg-dbus-cross chicken-egg-ssax-cross chicken-egg-matchable-cross chicken-egg-advice-cross"
DEPENDS += "chicken-egg-dbus chicken-egg-ssax chicken-egg-matchable chicken-egg-advice chicken-egg-dbus-cross chicken-egg-ssax-cross chicken-egg-matchable-cross chicken-egg-advice-cross"
RDEPENDS_${PN} += "chicken-egg-dbus chicken-egg-ssax chicken-egg-matchable chicken-egg-advice"

inherit chicken_install

BBCLASSEXTEND = "cross"
