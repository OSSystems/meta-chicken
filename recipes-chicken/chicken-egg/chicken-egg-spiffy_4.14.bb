inherit chicken_install

SECTION = "devel/chicken"
DESCRIPTION = "A small but powerful web server"
DEPENDS_virtclass-cross += "chicken-cross chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-defstruct-cross chicken-egg-sendfile-cross chicken-egg-matchable-cross chicken-egg-regex-cross"
DEPENDS += "chicken chicken-egg-intarweb chicken-egg-uri-common chicken-egg-defstruct chicken-egg-sendfile chicken-egg-matchable chicken-egg-regex chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-defstruct-cross chicken-egg-sendfile-cross chicken-egg-matchable-cross chicken-egg-regex-cross chicken-egg-spiffy-cross"
RDEPENDS += "chicken-egg-intarweb chicken-egg-uri-common chicken-egg-defstruct chicken-egg-sendfile chicken-egg-matchable chicken-egg-regex"

BBCLASSEXTEND = "cross"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://spiffy.meta;md5=447f7442a88566a80a2dd220a44526cf"
