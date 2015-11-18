SECTION = "devel/chicken"
DESCRIPTION = "uri-match integration for spiffy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://spiffy-uri-match.meta;md5=95e0eb89c541c55165acee49fdf2fdaa"
DEPENDS_append_class-cross = " chicken-egg-uri-match-cross chicken-egg-spiffy-cross chicken-egg-uri-common-cross chicken-egg-intarweb-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-uri-match-crosssdk chicken-egg-spiffy-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-intarweb-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-uri-match nativesdk-chicken-egg-spiffy nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-intarweb chicken-egg-uri-match-crosssdk chicken-egg-spiffy-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-intarweb-crosssdk"
DEPENDS = " chicken-egg-uri-match chicken-egg-spiffy chicken-egg-uri-common chicken-egg-intarweb chicken-egg-uri-match-cross chicken-egg-spiffy-cross chicken-egg-uri-common-cross chicken-egg-intarweb-cross"
RDEPENDS_${PN} = " chicken-egg-uri-match chicken-egg-spiffy chicken-egg-uri-common chicken-egg-intarweb"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/spiffy-uri-match/spiffy-uri-match-${PV}.tar.gz"

SRC_URI[md5sum] = "f502f2d439de76819f0a9863b11e6878"
SRC_URI[sha256sum] = "c06a6b247bccd3b7e0885d652847cbd9a4864c7ff08de3fdf4313b534883b635"

S = "${WORKDIR}/spiffy-uri-match-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
