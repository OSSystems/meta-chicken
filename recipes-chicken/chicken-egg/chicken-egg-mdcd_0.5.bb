SECTION = "devel/chicken"
DESCRIPTION = "Inline Markdown documentation for your code with REPL support and generated files for public export."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mdcd.meta;md5=a97140b38fb872e4d0f4bd84cfc2c296"
DEPENDS_append_class-cross = " chicken-egg-directory-utils-cross chicken-egg-regex-cross chicken-egg-filepath-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-directory-utils-crosssdk chicken-egg-regex-crosssdk chicken-egg-filepath-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-directory-utils nativesdk-chicken-egg-regex nativesdk-chicken-egg-filepath chicken-egg-directory-utils-crosssdk chicken-egg-regex-crosssdk chicken-egg-filepath-crosssdk"
DEPENDS = " chicken-egg-directory-utils chicken-egg-regex chicken-egg-filepath chicken-egg-directory-utils-cross chicken-egg-regex-cross chicken-egg-filepath-cross chicken-egg-mdcd-cross"
RDEPENDS_${PN} = " chicken-egg-directory-utils chicken-egg-regex chicken-egg-filepath"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/mdcd/mdcd-${PV}.tar.gz"

SRC_URI[md5sum] = "28a413556edaaf0673901c3392ce17ea"
SRC_URI[sha256sum] = "815f5adec91865e73fe322269c837a5b001c23abea30cffacea0bfd842ef61f7"

S = "${WORKDIR}/mdcd-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
