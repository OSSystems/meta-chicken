SECTION = "devel/chicken"
DESCRIPTION = "Functions to work with hexagonal grids (e.g. for wargames)."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://hexgrid.meta;md5=6503a2a56098235f2fb61b86ab157dc0"
DEPENDS_append_class-cross = " chicken-egg-bindings-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-bindings-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-bindings chicken-egg-bindings-crosssdk"
DEPENDS = " chicken-egg-bindings chicken-egg-bindings-cross"
RDEPENDS_${PN} = " chicken-egg-bindings"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/hexgrid/hexgrid-${PV}.tar.gz"

SRC_URI[md5sum] = "fa4058c110f95917b13b81b353d2debd"
SRC_URI[sha256sum] = "cdd2fcb4b35f504eab9f416c8f5d89a902f17354939ff954520e72f953c62891"

S = "${WORKDIR}/hexgrid-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
