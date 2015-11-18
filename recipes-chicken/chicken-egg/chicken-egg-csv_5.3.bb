SECTION = "devel/chicken"
DESCRIPTION = "Parsing and formatting of comma-separated values (CSV)."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://csv.meta;md5=33959e373c2c2472c43198ad21ca6bab"
DEPENDS_append_class-cross = " chicken-egg-regex-cross chicken-egg-utf8-cross chicken-egg-typeclass-cross chicken-egg-abnf-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-regex-crosssdk chicken-egg-utf8-crosssdk chicken-egg-typeclass-crosssdk chicken-egg-abnf-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-regex nativesdk-chicken-egg-utf8 nativesdk-chicken-egg-typeclass nativesdk-chicken-egg-abnf chicken-egg-regex-crosssdk chicken-egg-utf8-crosssdk chicken-egg-typeclass-crosssdk chicken-egg-abnf-crosssdk"
DEPENDS = " chicken-egg-regex chicken-egg-utf8 chicken-egg-typeclass chicken-egg-abnf chicken-egg-regex-cross chicken-egg-utf8-cross chicken-egg-typeclass-cross chicken-egg-abnf-cross chicken-egg-csv-cross"
RDEPENDS_${PN} = " chicken-egg-regex chicken-egg-utf8 chicken-egg-typeclass chicken-egg-abnf"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/csv/csv-${PV}.tar.gz"

SRC_URI[md5sum] = "1650fa61a9eab9505260b8f354d53a31"
SRC_URI[sha256sum] = "e2057988c720ee6e004d5e6a34db189e9e5f2b36b8478e3af6c0a034e70198ef"

S = "${WORKDIR}/csv-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
