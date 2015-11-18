SECTION = "devel/chicken"
DESCRIPTION = "Simple source patch utility"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://patch.meta;md5=45bdf32b523fcaac3cfe8f1f52f20f09"
DEPENDS_append_class-cross = " chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-regex chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-regex chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/patch/patch-${PV}.tar.gz"

SRC_URI[md5sum] = "fab2dc8ad6777959e5a471b7f55cf168"
SRC_URI[sha256sum] = "fb4f0d8e7050c360eed0da6f2b1706df4ff08662e17e0d360b219aa198dbbe1e"

S = "${WORKDIR}/patch-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
