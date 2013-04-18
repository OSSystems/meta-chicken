SECTION = "devel/chicken"
DESCRIPTION = "A more convenient HTTP library"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://intarweb.meta;md5=9e5ee287a3c060f363953d559dd2f22d"
DEPENDS_virtclass-cross += "chicken-egg-defstruct-cross chicken-egg-uri-common-cross chicken-egg-base64-cross chicken-egg-regex-cross"
DEPENDS += "chicken-egg-defstruct chicken-egg-uri-common chicken-egg-base64 chicken-egg-regex chicken-egg-defstruct-cross chicken-egg-uri-common-cross chicken-egg-base64-cross chicken-egg-regex-cross"
RDEPENDS_${PN} += "chicken-egg-defstruct chicken-egg-uri-common chicken-egg-base64 chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "8c5a4fe1f2e6a3a3c29a4fe0267adfac"
SRC_URI[sha256sum] = "16ee16b4b3e9c232bce2f42005e751e7d676f6b1dc73b28df749c0a6db46b907"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
