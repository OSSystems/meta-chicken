SECTION = "devel/chicken"
DESCRIPTION = "Arithmetic and Cryptography on Elliptic Curve Groups over Finite Fields"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://elliptic-curves.meta;md5=0d8be3a4194177a4fa7a2b63e268581f"
DEPENDS_append_class-cross = " chicken-egg-numbers-cross chicken-egg-modular-arithmetic-cross chicken-egg-defstruct-cross chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-numbers-crosssdk chicken-egg-modular-arithmetic-crosssdk chicken-egg-defstruct-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-numbers nativesdk-chicken-egg-modular-arithmetic nativesdk-chicken-egg-defstruct nativesdk-chicken-egg-matchable chicken-egg-numbers-crosssdk chicken-egg-modular-arithmetic-crosssdk chicken-egg-defstruct-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-numbers chicken-egg-modular-arithmetic chicken-egg-defstruct chicken-egg-matchable chicken-egg-numbers-cross chicken-egg-modular-arithmetic-cross chicken-egg-defstruct-cross chicken-egg-matchable-cross chicken-egg-elliptic-curves-cross"
RDEPENDS_${PN} = " chicken-egg-numbers chicken-egg-modular-arithmetic chicken-egg-defstruct chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/elliptic-curves/elliptic-curves-${PV}.tar.gz"

SRC_URI[md5sum] = "6ca28a8e7027b420eb477d6b4a1c645c"
SRC_URI[sha256sum] = "cbc7c114b0bb18bd53122e470e37198c8db2ea922c9cbaebfd4e4bd3f0fb01e9"

S = "${WORKDIR}/elliptic-curves-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
