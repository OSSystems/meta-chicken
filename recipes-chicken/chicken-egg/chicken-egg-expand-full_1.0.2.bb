inherit chicken_install

SECTION = "devel/chicken"
DESCRIPTION = "Full macro expansion"
DEPENDS_virtclass-cross += "chicken-cross chicken-egg-setup-helper-cross"
DEPENDS += "chicken chicken-egg-setup-helper chicken-egg-setup-helper-cross"
RDEPENDS += "chicken-egg-setup-helper"

BBCLASSEXTEND = "cross"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://expand-full.meta;md5=2f9e841945892461c7e390e5a81d17ea"
