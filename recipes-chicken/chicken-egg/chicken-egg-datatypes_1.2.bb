SECTION = "devel/chicken"
DESCRIPTION = "Creating concrete and abstract types as in ML"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://datatypes.meta;md5=af7ca0df8647049ade6b30bfe8c62008"
DEPENDS_append_class-cross = " chicken-egg-bindings-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-bindings-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-bindings chicken-egg-bindings-crosssdk"
DEPENDS = " chicken-egg-bindings chicken-egg-bindings-cross"
RDEPENDS_${PN} = " chicken-egg-bindings"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/datatypes/datatypes-${PV}.tar.gz"

SRC_URI[md5sum] = "0b69a8155772bc3acbadc7127dda4d19"
SRC_URI[sha256sum] = "779c87d35395d1c7f3c9172e0701912881990ab4cb24be84bb840cf280a63e48"

S = "${WORKDIR}/datatypes-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
