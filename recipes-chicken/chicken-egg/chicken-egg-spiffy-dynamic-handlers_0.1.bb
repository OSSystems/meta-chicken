SECTION = "devel/chicken"
DESCRIPTION = "Deprecated Spiffy extensions for dynamically generating pages"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://spiffy-dynamic-handlers.meta;md5=e36698abc455e10beddcda6e10f292f7"
DEPENDS_append_class-cross = " chicken-egg-spiffy-cross chicken-egg-intarweb-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-spiffy-crosssdk chicken-egg-intarweb-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-spiffy nativesdk-chicken-egg-intarweb chicken-egg-spiffy-crosssdk chicken-egg-intarweb-crosssdk"
DEPENDS = " chicken-egg-spiffy chicken-egg-intarweb chicken-egg-spiffy-cross chicken-egg-intarweb-cross"
RDEPENDS_${PN} = " chicken-egg-spiffy chicken-egg-intarweb"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/spiffy-dynamic-handlers/spiffy-dynamic-handlers-${PV}.tar.gz"

SRC_URI[md5sum] = "42397793b3e10756ba317a7fb5a5e031"
SRC_URI[sha256sum] = "e30650944cac31e4455607e7aa8bb34742cfa2f9a48cf41cfb170fd23e61d5ea"

S = "${WORKDIR}/spiffy-dynamic-handlers-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
