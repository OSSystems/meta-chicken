SECTION = "devel/chicken"
DESCRIPTION = "Utility functions for SRFI-4 vectors."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://srfi-4-utils.meta;md5=93fc9be54be2c00eae77a75712dabcd4"
DEPENDS_append_class-cross = " chicken-egg-srfi-42-cross chicken-egg-srfi-4-comprehensions-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-srfi-42-crosssdk chicken-egg-srfi-4-comprehensions-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-srfi-42 nativesdk-chicken-egg-srfi-4-comprehensions chicken-egg-srfi-42-crosssdk chicken-egg-srfi-4-comprehensions-crosssdk"
DEPENDS = " chicken-egg-srfi-42 chicken-egg-srfi-4-comprehensions chicken-egg-srfi-42-cross chicken-egg-srfi-4-comprehensions-cross"
RDEPENDS_${PN} = " chicken-egg-srfi-42 chicken-egg-srfi-4-comprehensions"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-4-utils/srfi-4-utils-${PV}.tar.gz"

SRC_URI[md5sum] = "9eae4e71433f3a6a6622aaf6c4c0dead"
SRC_URI[sha256sum] = "80c57c5f53f95537ce6d8b6ee1a5eb161dfbd5b5f0df086afb5bdf47689b4e2e"

S = "${WORKDIR}/srfi-4-utils-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
