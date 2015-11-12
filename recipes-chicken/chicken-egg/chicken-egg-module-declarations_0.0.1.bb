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

SRC_URI[md5sum] = "a28e73d36cd954be163e733389728f1f"
SRC_URI[sha256sum] = "385d8c45371b683ebade8dfb08d2951c410c729a87fd474caba4015c3697e005"

S = "${WORKDIR}/module-declarations-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
