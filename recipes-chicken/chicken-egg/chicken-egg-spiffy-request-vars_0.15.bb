SECTION = "devel/chicken"
DESCRIPTION = "Provides easy access to variables from HTTP requests"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://spiffy-request-vars.meta;md5=99306dbd57fc1a79ba871bbdad01c01d"
DEPENDS_virtclass-cross += "chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-spiffy-cross"
DEPENDS += "chicken-egg-intarweb chicken-egg-uri-common chicken-egg-spiffy chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-spiffy-cross"
RDEPENDS_${PN} += "chicken-egg-intarweb chicken-egg-uri-common chicken-egg-spiffy"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "273509af9296e0827c29c1097dee90c5"
SRC_URI[sha256sum] = "be0b6ce7e126bb9b56239635262b067726a6cbef5d39f69fe9ee0595a924fad5"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
