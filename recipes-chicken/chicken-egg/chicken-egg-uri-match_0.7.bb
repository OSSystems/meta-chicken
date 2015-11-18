SECTION = "devel/chicken"
DESCRIPTION = "A flexible URI matcher"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://uri-match.meta;md5=b5c6d9571839c41a26ef287ea23a8014"
DEPENDS_append_class-cross = " chicken-egg-uri-common-cross chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-uri-common-crosssdk chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-regex chicken-egg-uri-common-crosssdk chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-uri-common chicken-egg-regex chicken-egg-uri-common-cross chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-uri-common chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/uri-match/uri-match-${PV}.tar.gz"

SRC_URI[md5sum] = "86393ee90f210b2ee3c976b0c92a7b1d"
SRC_URI[sha256sum] = "02b63e3b0f514588ffd3e0219f19ae724cda2341f605809d63935bf145d122d2"

S = "${WORKDIR}/uri-match-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
