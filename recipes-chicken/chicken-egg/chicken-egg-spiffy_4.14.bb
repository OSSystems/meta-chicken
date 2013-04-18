SECTION = "devel/chicken"
DESCRIPTION = "A small but powerful web server"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://spiffy.meta;md5=447f7442a88566a80a2dd220a44526cf"
DEPENDS_virtclass-cross += "chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-defstruct-cross chicken-egg-sendfile-cross chicken-egg-matchable-cross chicken-egg-regex-cross"
DEPENDS += "chicken-egg-intarweb chicken-egg-uri-common chicken-egg-defstruct chicken-egg-sendfile chicken-egg-matchable chicken-egg-regex chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-defstruct-cross chicken-egg-sendfile-cross chicken-egg-matchable-cross chicken-egg-regex-cross chicken-egg-spiffy-cross"
RDEPENDS_${PN} += "chicken-egg-intarweb chicken-egg-uri-common chicken-egg-defstruct chicken-egg-sendfile chicken-egg-matchable chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "d326b9b2b76bbb4e6e02c715e9401114"
SRC_URI[sha256sum] = "275d6cb9788e7c02a3cc2196f354bcb9da32543b159e93586c34f74e358e4e57"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
