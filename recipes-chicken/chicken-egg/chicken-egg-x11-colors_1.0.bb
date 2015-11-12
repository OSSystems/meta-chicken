SECTION = "devel/chicken"
DESCRIPTION = "named standard colors as available in X11"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://x11-colors.meta;md5=d64b29915cfd799a164f38881b84147a"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/x11-colors/x11-colors-${PV}.tar.gz"

SRC_URI[md5sum] = "07e05a9b25b0ebf37b9f994d73dd5e1b"
SRC_URI[sha256sum] = "fcd8aa3bf6f1cf62dde86317a46566013c37ca18137c05f775dd4e20f5635fc7"

S = "${WORKDIR}/x11-colors-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
