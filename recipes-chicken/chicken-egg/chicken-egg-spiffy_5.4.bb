SECTION = "devel/chicken"
DESCRIPTION = "A small but powerful web server"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://spiffy.meta;md5=a6ad4f7d1b9a61455c3c93df7f436b00"
DEPENDS_append_class-cross = " chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-uri-generic-cross chicken-egg-sendfile-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-intarweb-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-uri-generic-crosssdk chicken-egg-sendfile-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-intarweb nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-uri-generic nativesdk-chicken-egg-sendfile chicken-egg-intarweb-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-uri-generic-crosssdk chicken-egg-sendfile-crosssdk"
DEPENDS = " chicken-egg-intarweb chicken-egg-uri-common chicken-egg-uri-generic chicken-egg-sendfile chicken-egg-intarweb-cross chicken-egg-uri-common-cross chicken-egg-uri-generic-cross chicken-egg-sendfile-cross chicken-egg-spiffy-cross"
RDEPENDS_${PN} = " chicken-egg-intarweb chicken-egg-uri-common chicken-egg-uri-generic chicken-egg-sendfile"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/spiffy/spiffy-${PV}.tar.gz"

SRC_URI[md5sum] = "199e2e1805eca96b77d3cc0da69da7df"
SRC_URI[sha256sum] = "2a4670a599b497260e9df62ef596afddfd1c835e06db2d8eb9eb5abc54fa9434"

S = "${WORKDIR}/spiffy-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
