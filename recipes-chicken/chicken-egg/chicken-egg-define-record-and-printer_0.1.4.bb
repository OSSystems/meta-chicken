SECTION = "devel/chicken"
DESCRIPTION = "Trivial macro to define records and appropriate printers"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://define-record-and-printer.meta;md5=7553077fc9d805c2217dbc2961f7ff61"
DEPENDS_append_class-cross = " chicken-egg-hahn-cross chicken-egg-matchable-cross chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-hahn-crosssdk chicken-egg-matchable-crosssdk chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-hahn nativesdk-chicken-egg-matchable nativesdk-chicken-egg-setup-helper chicken-egg-hahn-crosssdk chicken-egg-matchable-crosssdk chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-hahn chicken-egg-matchable chicken-egg-setup-helper chicken-egg-hahn-cross chicken-egg-matchable-cross chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-hahn chicken-egg-matchable chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/define-record-and-printer/define-record-and-printer-${PV}.tar.gz"

SRC_URI[md5sum] = "df9cad920f696789f4e54ddb8ba30ec5"
SRC_URI[sha256sum] = "93f2132b65e51f954cc155fb8c0b97cbdec1721c7419e5918078aa91d5cd8db1"

S = "${WORKDIR}/define-record-and-printer-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
