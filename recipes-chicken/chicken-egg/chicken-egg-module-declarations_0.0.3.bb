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

SRC_URI[md5sum] = "7c5dd43b42016df128ca2ce285f44d33"
SRC_URI[sha256sum] = "51225f2019a7eb6efa111fb16daafea0ecdfbf0354047f53e1fed8d9545f6f05"

S = "${WORKDIR}/module-declarations-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
