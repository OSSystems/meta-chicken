SECTION = "devel/chicken"
DESCRIPTION = "High-level HTTP client library"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://http-client.meta;md5=f8b89495dffbfc34cf39d711a83de276"
DEPENDS_virtclass-cross += "chicken-egg-intarweb-cross chicken-egg-openssl-cross chicken-egg-uri-common-cross chicken-egg-message-digest-cross chicken-egg-md5-cross chicken-egg-string-utils-cross chicken-egg-sendfile-cross"
DEPENDS += "chicken-egg-intarweb chicken-egg-openssl chicken-egg-uri-common chicken-egg-message-digest chicken-egg-md5 chicken-egg-string-utils chicken-egg-sendfile chicken-egg-intarweb-cross chicken-egg-openssl-cross chicken-egg-uri-common-cross chicken-egg-message-digest-cross chicken-egg-md5-cross chicken-egg-string-utils-cross chicken-egg-sendfile-cross"
RDEPENDS_${PN} += "chicken-egg-intarweb chicken-egg-openssl chicken-egg-uri-common chicken-egg-message-digest chicken-egg-md5 chicken-egg-string-utils chicken-egg-sendfile"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "5c4112a891ea25304d657b7ff3a0397a"
SRC_URI[sha256sum] = "e6ae9bdc24562b70d83c36791ce31dc660fac9f45957a18b1df1e1cf9f7cce04"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
