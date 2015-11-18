SECTION = "devel/chicken"
DESCRIPTION = "Serve extensions over HTTP"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://henrietta.meta;md5=f8e82d56b96f98a9b7181a564f9ef0cc"
DEPENDS_append_class-cross = " chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-regex chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-regex chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/henrietta/henrietta-${PV}.tar.gz"

SRC_URI[md5sum] = "5e12aa7712343e7f3cdff8971fbcc514"
SRC_URI[sha256sum] = "429569ad9921835609ca43ddce74b44b47d7ed445f11a7f6b5e80a042bfb89cc"

S = "${WORKDIR}/henrietta-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
