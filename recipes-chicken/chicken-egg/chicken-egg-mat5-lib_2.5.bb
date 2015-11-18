SECTION = "devel/chicken"
DESCRIPTION = "Reading and writing Level 5 MAT-File format."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://mat5-lib.meta;md5=495e31740d5e80c62b9412b7d89f96dc"
DEPENDS_append_class-cross = " chicken-egg-datatype-cross chicken-egg-srfi-63-cross chicken-egg-iset-cross chicken-egg-endian-port-cross chicken-egg-z3-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-datatype-crosssdk chicken-egg-srfi-63-crosssdk chicken-egg-iset-crosssdk chicken-egg-endian-port-crosssdk chicken-egg-z3-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-datatype nativesdk-chicken-egg-srfi-63 nativesdk-chicken-egg-iset nativesdk-chicken-egg-endian-port nativesdk-chicken-egg-z3 chicken-egg-datatype-crosssdk chicken-egg-srfi-63-crosssdk chicken-egg-iset-crosssdk chicken-egg-endian-port-crosssdk chicken-egg-z3-crosssdk"
DEPENDS = " chicken-egg-datatype chicken-egg-srfi-63 chicken-egg-iset chicken-egg-endian-port chicken-egg-z3 chicken-egg-datatype-cross chicken-egg-srfi-63-cross chicken-egg-iset-cross chicken-egg-endian-port-cross chicken-egg-z3-cross"
RDEPENDS_${PN} = " chicken-egg-datatype chicken-egg-srfi-63 chicken-egg-iset chicken-egg-endian-port chicken-egg-z3"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/mat5-lib/mat5-lib-${PV}.tar.gz"

SRC_URI[md5sum] = "77e16d1d2856f915a9c8180b404ca30d"
SRC_URI[sha256sum] = "7a694cf332cd5e80c2dcb1dbc539c3534c412954c0b49b9aa0fe38978a869f0b"

S = "${WORKDIR}/mat5-lib-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
