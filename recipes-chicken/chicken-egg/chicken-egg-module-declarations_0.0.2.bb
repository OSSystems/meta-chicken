SECTION = "devel/chicken"
DESCRIPTION = "Module declarations"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://module-declarations.meta;md5=91bd4d3f9fefa5c8d8dbef8a2beb756a"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/module-declarations/module-declarations-${PV}.tar.gz"

SRC_URI[md5sum] = "6f8bc798336bf756f1213cffc20959ca"
SRC_URI[sha256sum] = "cf0d1c8e08c3f32c92566db8eb9c1c86a7b6b7a0ee7dbd9a09d36553e353cbcf"

S = "${WORKDIR}/module-declarations-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
