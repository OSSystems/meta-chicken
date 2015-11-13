SECTION = "devel/chicken"
DESCRIPTION = "dsssl-utils"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://dsssl-utils.meta;md5=76817f1ed57d667c75b59e14e38bf09b"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/dsssl-utils/dsssl-utils-${PV}.tar.gz"

SRC_URI[md5sum] = "8f8a8b8524a43edaf4a60768fb889b9e"
SRC_URI[sha256sum] = "71237471e7aced0534694841fba025b6883b3c10c1edb87402daf2632a7cd7a9"

S = "${WORKDIR}/dsssl-utils-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
