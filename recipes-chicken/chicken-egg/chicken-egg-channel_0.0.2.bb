SECTION = "devel/chicken"
DESCRIPTION = "A reactive channel implementation inspired by lamina for Clojure (https://github.com/ztellman/lamina)"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://channel.meta;md5=973d625cd42002f1ba0fa4ccc3def1b4"
DEPENDS_virtclass-cross += "chicken-egg-miscmacros-cross"
DEPENDS += "chicken-egg-miscmacros chicken-egg-miscmacros-cross"
RDEPENDS_${PN} += "chicken-egg-miscmacros"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "7357b100f6daff54f50c08732b0f02e8"
SRC_URI[sha256sum] = "742461faca5e0a6fbba90b1932684b54bf036385ab1c980fedf88ed6138fc2eb"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
