SECTION = "devel/chicken"
DESCRIPTION = "Facilities for managing HTTP sessions"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://http-session.meta;md5=a3b1df0688d5748db2739bb2a61b2e0d"
DEPENDS_virtclass-cross += "chicken-egg-simple-sha1-cross chicken-egg-spiffy-cross chicken-egg-intarweb-cross chicken-egg-uri-common-cross"
DEPENDS += "chicken-egg-simple-sha1 chicken-egg-spiffy chicken-egg-intarweb chicken-egg-uri-common chicken-egg-simple-sha1-cross chicken-egg-spiffy-cross chicken-egg-intarweb-cross chicken-egg-uri-common-cross"
RDEPENDS_${PN} += "chicken-egg-simple-sha1 chicken-egg-spiffy chicken-egg-intarweb chicken-egg-uri-common"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "bfe6598de48ef59c2468e29191ef5059"
SRC_URI[sha256sum] = "d5bc458598d50520cb9a1ad90596cde8fb8d2a75cb0888ff2e0f1edd0c84d6c8"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
