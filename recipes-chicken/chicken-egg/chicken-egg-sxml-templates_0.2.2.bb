SECTION = "devel/chicken"
DESCRIPTION = "A simple facility for subtituting values into SXML expressions"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://sxml-templates.meta;md5=0379c50ab91b00b2ff099f9e50b6c513"
DEPENDS_append_class-cross = " chicken-egg-sxml-transforms-cross chicken-egg-records-cross chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-sxml-transforms-crosssdk chicken-egg-records-crosssdk chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-sxml-transforms nativesdk-chicken-egg-records nativesdk-chicken-egg-setup-helper chicken-egg-sxml-transforms-crosssdk chicken-egg-records-crosssdk chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-sxml-transforms chicken-egg-records chicken-egg-setup-helper chicken-egg-sxml-transforms-cross chicken-egg-records-cross chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-sxml-transforms chicken-egg-records chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sxml-templates/sxml-templates-${PV}.tar.gz"

SRC_URI[md5sum] = "ed5de336882fa783436ea9af25cad455"
SRC_URI[sha256sum] = "b0bb11166b6e62e465a29f98018a62237ce4546140318b0e2778f88a196d1ab2"

S = "${WORKDIR}/sxml-templates-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
