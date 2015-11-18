SECTION = "devel/chicken"
DESCRIPTION = "Definition and code generators for a simple applicative language for numerical simulation."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://flsim.meta;md5=0231373a7de412b111d3bf00567a11d7"
DEPENDS_append_class-cross = " chicken-egg-make-cross chicken-egg-numbers-cross chicken-egg-mathh-cross chicken-egg-datatype-cross chicken-egg-random-mtzig-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-make-crosssdk chicken-egg-numbers-crosssdk chicken-egg-mathh-crosssdk chicken-egg-datatype-crosssdk chicken-egg-random-mtzig-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-make nativesdk-chicken-egg-numbers nativesdk-chicken-egg-mathh nativesdk-chicken-egg-datatype nativesdk-chicken-egg-random-mtzig chicken-egg-make-crosssdk chicken-egg-numbers-crosssdk chicken-egg-mathh-crosssdk chicken-egg-datatype-crosssdk chicken-egg-random-mtzig-crosssdk"
DEPENDS = " chicken-egg-make chicken-egg-numbers chicken-egg-mathh chicken-egg-datatype chicken-egg-random-mtzig chicken-egg-make-cross chicken-egg-numbers-cross chicken-egg-mathh-cross chicken-egg-datatype-cross chicken-egg-random-mtzig-cross"
RDEPENDS_${PN} = " chicken-egg-make chicken-egg-numbers chicken-egg-mathh chicken-egg-datatype chicken-egg-random-mtzig"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/flsim/flsim-${PV}.tar.gz"

SRC_URI[md5sum] = "c56f2c34c4484b467b82c52fe1fa688a"
SRC_URI[sha256sum] = "3e458ddcd4a5e72b90fedfcc55c2d6ea7eac83db5e77f708ea97179de4747a15"

S = "${WORKDIR}/flsim-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
