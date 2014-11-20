SECTION = "devel/chicken"
DESCRIPTION = "High-level HTTP client library"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://http-client.meta;md5=b93a27cebfaf93a886e0b0be8b1d5baa"
DEPENDS_class-cross += "chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-message-digest-cross chicken-egg-md5-cross chicken-egg-string-utils-cross chicken-egg-sendfile-cross"
DEPENDS += "chicken-egg-intarweb chicken-egg-uri-common chicken-egg-message-digest chicken-egg-md5 chicken-egg-string-utils chicken-egg-sendfile chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-message-digest-cross chicken-egg-md5-cross chicken-egg-string-utils-cross chicken-egg-sendfile-cross"
RDEPENDS_${PN} += "chicken-egg-intarweb chicken-egg-uri-common chicken-egg-message-digest chicken-egg-md5 chicken-egg-string-utils chicken-egg-sendfile"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "e0f792f3b14749dd431e5232ae4be83d"
SRC_URI[sha256sum] = "4c2384e5e8c0e804b7460fc1e5299fb3afde11aead39bdfe755ad08b0678bdfb"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
