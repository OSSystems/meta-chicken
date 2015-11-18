SECTION = "devel/chicken"
DESCRIPTION = "Flexible directory listing for Spiffy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://spiffy-directory-listing.meta;md5=45830b55b5c5f12a31e6735a8589b8a4"
DEPENDS_append_class-cross = " chicken-egg-spiffy-cross chicken-egg-html-utils-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-spiffy-crosssdk chicken-egg-html-utils-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-spiffy nativesdk-chicken-egg-html-utils chicken-egg-spiffy-crosssdk chicken-egg-html-utils-crosssdk"
DEPENDS = " chicken-egg-spiffy chicken-egg-html-utils chicken-egg-spiffy-cross chicken-egg-html-utils-cross"
RDEPENDS_${PN} = " chicken-egg-spiffy chicken-egg-html-utils"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/spiffy-directory-listing/spiffy-directory-listing-${PV}.tar.gz"

SRC_URI[md5sum] = "9a8adf2cb69790c8500640c449a1a8f7"
SRC_URI[sha256sum] = "f20fbe5e4f789ae9079d45ac263172960851b2aa63c1cf4f261d60c809b8a1a8"

S = "${WORKDIR}/spiffy-directory-listing-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
