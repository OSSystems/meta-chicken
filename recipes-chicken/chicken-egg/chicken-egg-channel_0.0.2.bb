SECTION = "devel/chicken"
DESCRIPTION = "A reactive channel implementation inspired by lamina for Clojure (https://github.com/ztellman/lamina)"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://channel.meta;md5=973d625cd42002f1ba0fa4ccc3def1b4"
DEPENDS_virtclass-cross += "chicken-egg-miscmacros-cross"
DEPENDS += "chicken-egg-miscmacros chicken-egg-miscmacros-cross"
RDEPENDS_${PN} += "chicken-egg-miscmacros"

inherit chicken_install

BBCLASSEXTEND = "cross"
