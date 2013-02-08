SECTION = "devel/chicken"
DESCRIPTION = "Binary-compatible flexible gettext reimplementation"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://free-gettext.meta;md5=e9522ab8b41f83507a9b9ed62bdd9b26"
DEPENDS_virtclass-cross += "chicken-egg-charconv-cross"
DEPENDS += "chicken-egg-charconv chicken-egg-charconv-cross"
RDEPENDS_${PN} += "chicken-egg-charconv"

inherit chicken_install

BBCLASSEXTEND = "cross"
