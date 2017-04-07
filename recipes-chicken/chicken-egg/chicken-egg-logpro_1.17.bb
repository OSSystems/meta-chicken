SECTION = "devel/chicken"
DESCRIPTION = "Tool for analyzing log files to extract PASS/FAIL status"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://logpro.meta;md5=578ecd0626836a531318547abdc882d5"
DEPENDS_append_class-cross = " chicken-egg-format-cross chicken-egg-regex-cross chicken-egg-regex-literals-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-format-crosssdk chicken-egg-regex-crosssdk chicken-egg-regex-literals-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-format nativesdk-chicken-egg-regex nativesdk-chicken-egg-regex-literals chicken-egg-format-crosssdk chicken-egg-regex-crosssdk chicken-egg-regex-literals-crosssdk"
DEPENDS = " chicken-egg-format chicken-egg-regex chicken-egg-regex-literals chicken-egg-format-cross chicken-egg-regex-cross chicken-egg-regex-literals-cross"
RDEPENDS_${PN} = " chicken-egg-format chicken-egg-regex chicken-egg-regex-literals"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/logpro/logpro-${PV}.tar.gz"

SRC_URI[md5sum] = "4971da83cf0e48d52036ba2fcf169bdc"
SRC_URI[sha256sum] = "ada8ef03f4ed3f12f9b98af9714fbbe1458c3ce1eb14dfbcdd2a33aded610d9d"

S = "${WORKDIR}/logpro-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
