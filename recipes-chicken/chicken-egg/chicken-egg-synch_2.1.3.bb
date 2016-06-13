SECTION = "devel/chicken"
DESCRIPTION = "Synchronization Forms"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://synch.meta;md5=a0d7e9ca08871bbb380b6fcc63c83c12"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-check-errors chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-check-errors"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/synch/synch-${PV}.tar.gz"

SRC_URI[md5sum] = "55da5a326357de2434a37309aec319a7"
SRC_URI[sha256sum] = "b2ae56c245d1e3b7842dc8d0e652f3737c5d280fdca0d9bff4a72dfc78c78ea4"

S = "${WORKDIR}/synch-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
