SECTION = "devel/chicken"
DESCRIPTION = "Provides an easy to use <code>case</code> construct for regular expression matching"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://regex-case.meta;md5=e619ed2ca34b398ddd88e18ee8142f72"
DEPENDS_append_class-cross = " chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-regex chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-regex chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/regex-case/regex-case-${PV}.tar.gz"

SRC_URI[md5sum] = "16b02edb0583b82dce058f7247de4981"
SRC_URI[sha256sum] = "66434be5de9c3bb05a5f9ad38374756ad7b9790c58180530630cf8ac66cd843b"

S = "${WORKDIR}/regex-case-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
