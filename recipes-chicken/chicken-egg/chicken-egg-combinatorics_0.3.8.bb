SECTION = "devel/chicken"
DESCRIPTION = "Combinatorics"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://combinatorics.meta;md5=544c5aff01bec579b4609ab73a3f9f97"
DEPENDS_append_class-cross = " chicken-egg-hahn-cross chicken-egg-setup-helper-cross chicken-egg-vector-lib-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-hahn-crosssdk chicken-egg-setup-helper-crosssdk chicken-egg-vector-lib-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-hahn nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-vector-lib chicken-egg-hahn-crosssdk chicken-egg-setup-helper-crosssdk chicken-egg-vector-lib-crosssdk"
DEPENDS = " chicken-egg-hahn chicken-egg-setup-helper chicken-egg-vector-lib chicken-egg-hahn-cross chicken-egg-setup-helper-cross chicken-egg-vector-lib-cross"
RDEPENDS_${PN} = " chicken-egg-hahn chicken-egg-setup-helper chicken-egg-vector-lib"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/combinatorics/combinatorics-${PV}.tar.gz"

SRC_URI[md5sum] = "5a5efbd1c117833fac396f23044c30b8"
SRC_URI[sha256sum] = "118e6baf43548ef3ed9d3f2a0917309959affa90d88bc65a418132a150407762"

S = "${WORKDIR}/combinatorics-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
