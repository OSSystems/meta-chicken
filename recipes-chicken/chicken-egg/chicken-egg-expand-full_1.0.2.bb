SECTION = "devel/chicken"
DESCRIPTION = "Full macro expansion"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://expand-full.meta;md5=2f9e841945892461c7e390e5a81d17ea"
DEPENDS_virtclass-cross += "chicken-egg-setup-helper-cross"
DEPENDS += "chicken-egg-setup-helper chicken-egg-setup-helper-cross"
RDEPENDS += "chicken-egg-setup-helper"

inherit chicken_install

BBCLASSEXTEND = "cross"
