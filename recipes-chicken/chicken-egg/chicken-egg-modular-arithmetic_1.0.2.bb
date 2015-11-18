SECTION = "devel/chicken"
DESCRIPTION = "Modular Arithmetic on Finite Fields"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://modular-arithmetic.meta;md5=8a309ca2cce7edd505254fe4b3955d3b"
DEPENDS_append_class-cross = " chicken-egg-numbers-cross chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-numbers-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-numbers nativesdk-chicken-egg-matchable chicken-egg-numbers-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-numbers chicken-egg-matchable chicken-egg-numbers-cross chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-numbers chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/modular-arithmetic/modular-arithmetic-${PV}.tar.gz"

SRC_URI[md5sum] = "c718f932a17e070d0900480526fcd0e6"
SRC_URI[sha256sum] = "ec5fca12cf36bd800595a1956f8d6ca421b9395da3cf15e8805d14251dd749b4"

S = "${WORKDIR}/modular-arithmetic-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
