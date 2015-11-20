SECTION = "devel/chicken"
DESCRIPTION = "GNU DBM interface"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://gdbm.meta;md5=9a37f0f5d3044a03d37ba9c4a6399c71"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross gdbm-native"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk gdbm-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper gdbm chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/gdbm/gdbm-${PV}.tar.gz"

SRC_URI[md5sum] = "df61801b644d70387b0162420f1c00c2"
SRC_URI[sha256sum] = "5f513d88daab261927dc0f61040627d5f93ee9f6a384b4d24895cbe3b86ad2f0"

S = "${WORKDIR}/gdbm-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
