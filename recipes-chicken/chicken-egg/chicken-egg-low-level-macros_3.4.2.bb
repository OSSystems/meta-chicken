SECTION = "devel/chicken"
DESCRIPTION = "Low-level macros with pattern matching"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://low-level-macros.meta;md5=26b65ab33c56f8ee713d7bb03b5c5553"
DEPENDS = " chicken-egg-low-level-macros-cross"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/low-level-macros/low-level-macros-${PV}.tar.gz"

SRC_URI[md5sum] = "be91b3a849630fa06abfb23dc915afe6"
SRC_URI[sha256sum] = "857a33fb88397a2b30aaa7e2b6c023427b6aef061918d247dfd8274dc6c814a0"

S = "${WORKDIR}/low-level-macros-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
