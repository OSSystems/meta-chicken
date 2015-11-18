SECTION = "devel/chicken"
DESCRIPTION = "Creates tarballs for eggs in henrietta cache"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://egg-tarballs.meta;md5=7f759cb6753a7866295ced52db73f325"
DEPENDS_append_class-cross = " chicken-egg-simple-sha1-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-simple-sha1-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-simple-sha1 chicken-egg-simple-sha1-crosssdk"
DEPENDS = " chicken-egg-simple-sha1 chicken-egg-simple-sha1-cross"
RDEPENDS_${PN} = " chicken-egg-simple-sha1"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/egg-tarballs/egg-tarballs-${PV}.tar.gz"

SRC_URI[md5sum] = "adc3807f3f674c68b8dc852d33864ac5"
SRC_URI[sha256sum] = "a3e131c4a9335b89c407ab76dc5281002e98f1f1b6f64e66b058f382208fe8cf"

S = "${WORKDIR}/egg-tarballs-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
