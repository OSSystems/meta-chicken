SECTION = "devel/chicken"
DESCRIPTION = "Manage ConnMan using the D-Bus API "
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://connman.meta;md5=29d6fa445a6317f3c27fb3d59c8af3e9"
DEPENDS_virtclass-cross += "chicken-egg-dbus-cross chicken-egg-ssax-cross chicken-egg-matchable-cross chicken-egg-advice-cross"
DEPENDS += "chicken-egg-dbus chicken-egg-ssax chicken-egg-matchable chicken-egg-advice chicken-egg-dbus-cross chicken-egg-ssax-cross chicken-egg-matchable-cross chicken-egg-advice-cross"
RDEPENDS += "chicken-egg-dbus chicken-egg-ssax chicken-egg-matchable chicken-egg-advice"

inherit chicken_install

BBCLASSEXTEND = "cross"
