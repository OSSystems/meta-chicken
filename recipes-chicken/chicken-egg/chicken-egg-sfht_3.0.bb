SECTION = "devel/chicken"
DESCRIPTION = "A dictionary data structure based on counting Bloom filters."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://sfht.meta;md5=51e810377f18f4428d9aa40d0d12cffa"
DEPENDS_append_class-cross = " chicken-egg-typeclass-cross chicken-egg-matchable-cross chicken-egg-sparse-vectors-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-typeclass-crosssdk chicken-egg-matchable-crosssdk chicken-egg-sparse-vectors-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-typeclass nativesdk-chicken-egg-matchable nativesdk-chicken-egg-sparse-vectors chicken-egg-typeclass-crosssdk chicken-egg-matchable-crosssdk chicken-egg-sparse-vectors-crosssdk"
DEPENDS = " chicken-egg-typeclass chicken-egg-matchable chicken-egg-sparse-vectors chicken-egg-typeclass-cross chicken-egg-matchable-cross chicken-egg-sparse-vectors-cross"
RDEPENDS_${PN} = " chicken-egg-typeclass chicken-egg-matchable chicken-egg-sparse-vectors"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sfht/sfht-${PV}.tar.gz"

SRC_URI[md5sum] = "ade9583bc2cf2857977ddde1fc78a1d6"
SRC_URI[sha256sum] = "412f40442afccd70b52576445c99594faffbbce99b6a3a0045359e32a0a3d12a"

S = "${WORKDIR}/sfht-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
