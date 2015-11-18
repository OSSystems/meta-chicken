SECTION = "devel/chicken"
DESCRIPTION = "Generates wrappers to REST-like HTTP APIs."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://rest-bind.meta;md5=6de055c4683378d818c2e70ab9a2bb78"
DEPENDS_append_class-cross = " chicken-egg-intarweb-cross chicken-egg-uri-common-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-intarweb-crosssdk chicken-egg-uri-common-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-intarweb nativesdk-chicken-egg-uri-common chicken-egg-intarweb-crosssdk chicken-egg-uri-common-crosssdk"
DEPENDS = " chicken-egg-intarweb chicken-egg-uri-common chicken-egg-intarweb-cross chicken-egg-uri-common-cross"
RDEPENDS_${PN} = " chicken-egg-intarweb chicken-egg-uri-common"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/rest-bind/rest-bind-${PV}.tar.gz"

SRC_URI[md5sum] = "cb52d7459c60c79795fceb5337ed2ad9"
SRC_URI[sha256sum] = "265103cfe82c5f6c8f972cd03b01091e9ce02d04d79a2d1bd487f2b6d84f7ed7"

S = "${WORKDIR}/rest-bind-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
