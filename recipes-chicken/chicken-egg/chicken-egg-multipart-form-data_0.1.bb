SECTION = "devel/chicken"
DESCRIPTION = "Reads & decodes HTTP multipart/form-data requests."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://multipart-form-data.meta;md5=0e38eee1cb03f62dbc7ade52d7435932"
DEPENDS_append_class-cross = " chicken-egg-intarweb-cross chicken-egg-comparse-cross chicken-egg-records-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-intarweb-crosssdk chicken-egg-comparse-crosssdk chicken-egg-records-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-intarweb nativesdk-chicken-egg-comparse nativesdk-chicken-egg-records chicken-egg-intarweb-crosssdk chicken-egg-comparse-crosssdk chicken-egg-records-crosssdk"
DEPENDS = " chicken-egg-intarweb chicken-egg-comparse chicken-egg-records chicken-egg-intarweb-cross chicken-egg-comparse-cross chicken-egg-records-cross"
RDEPENDS_${PN} = " chicken-egg-intarweb chicken-egg-comparse chicken-egg-records"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/multipart-form-data/multipart-form-data-${PV}.tar.gz"

SRC_URI[md5sum] = "455d1e27e5f0d40a557162d1eb1ab2d9"
SRC_URI[sha256sum] = "7ec37c808e5f9d04a5aaa212cfc517984aea5f821ecef15da84c459a5777fb3a"

S = "${WORKDIR}/multipart-form-data-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
