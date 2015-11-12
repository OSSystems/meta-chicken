SECTION = "devel/chicken"
DESCRIPTION = "A library for PDF generation."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://pdf.meta;md5=ccf1955dbc47c412362dd94f9f72ce6e"
DEPENDS_append_class-cross = " chicken-egg-format-cross chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-format-crosssdk chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-format nativesdk-chicken-egg-regex chicken-egg-format-crosssdk chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-format chicken-egg-regex chicken-egg-format-cross chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-format chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/pdf/pdf-${PV}.tar.gz"

SRC_URI[md5sum] = "9781d03594def123cfb50401a552f986"
SRC_URI[sha256sum] = "dca9e915e747cc24227aeb7c7d34345682fb031d094b91ead014e2f26dead98a"

S = "${WORKDIR}/pdf-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
