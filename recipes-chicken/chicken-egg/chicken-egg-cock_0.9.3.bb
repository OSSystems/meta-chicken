SECTION = "devel/chicken"
DESCRIPTION = "In-source documentation: deprecated for hahn"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://cock.meta;md5=c54f69bcbee8dccfffee9927d4ca39df"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/cock/cock-${PV}.tar.gz"

SRC_URI[md5sum] = "6ef36ff835f11982b8fe86b2ab2a3bb1"
SRC_URI[sha256sum] = "13d0ec0716cb86960e1b6b6cef6a8114e3f9516e2750fb0cfec69edacb1d79b8"

S = "${WORKDIR}/cock-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
