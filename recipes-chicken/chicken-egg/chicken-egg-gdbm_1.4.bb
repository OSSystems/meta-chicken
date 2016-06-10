SECTION = "devel/chicken"
DESCRIPTION = "GNU DBM interface"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://gdbm.meta;md5=9a37f0f5d3044a03d37ba9c4a6399c71"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross gdbm-native"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk gdbm-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-gdbm chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper gdbm chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/gdbm/gdbm-${PV}.tar.gz"

SRC_URI[md5sum] = "212c134ab6251e42c8c5fbdbd47f51b1"
SRC_URI[sha256sum] = "434a093c5fd7e9868146eb9a0e24f4bc1f2eb76d7b13a0276d93d838b5fc6df2"

S = "${WORKDIR}/gdbm-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
