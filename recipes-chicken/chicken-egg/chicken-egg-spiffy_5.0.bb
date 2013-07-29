SECTION = "devel/chicken"
DESCRIPTION = "A small but powerful web server"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://spiffy.meta;md5=7f6214b669c872d6f34f4a02db03541e"
DEPENDS_virtclass-cross += "chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-uri-generic-cross chicken-egg-sendfile-cross"
DEPENDS += "chicken-egg-intarweb chicken-egg-uri-common chicken-egg-uri-generic chicken-egg-sendfile chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-uri-generic-cross chicken-egg-sendfile-cross chicken-egg-spiffy-cross"
RDEPENDS_${PN} += "chicken-egg-intarweb chicken-egg-uri-common chicken-egg-uri-generic chicken-egg-sendfile"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "4f30b23cb94f39f9c9c5532324f6ec29"
SRC_URI[sha256sum] = "467b4fb06bf70c493ed19a69c507ded49edb8cdfe84cca8740880b7acf575771"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
