SECTION = "devel/chicken"
DESCRIPTION = "Combinators"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://combinators.meta;md5=5590ec3713f739b831f3cb8b56a3d147"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-setup-helper-cross chicken-egg-combinators-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/combinators/combinators-${PV}.tar.gz"

SRC_URI[md5sum] = "28af5ccfed48b9f39049ee9bbefd8745"
SRC_URI[sha256sum] = "ebe225590b79b627415c22ef8cce30c23c7b0dc7ed3758e750df4ac98c9dbd0d"

S = "${WORKDIR}/combinators-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
