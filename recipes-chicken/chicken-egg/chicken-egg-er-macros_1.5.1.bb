SECTION = "devel/chicken"
DESCRIPTION = "Explicit-renaming macros with pattern matching"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://er-macros.meta;md5=017bf4707fff82d24d204797fe191967"
DEPENDS_append_class-cross = " chicken-egg-contracts-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-contracts-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-contracts chicken-egg-contracts-crosssdk"
DEPENDS = " chicken-egg-contracts chicken-egg-contracts-cross"
RDEPENDS_${PN} = " chicken-egg-contracts"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/er-macros/er-macros-${PV}.tar.gz"

SRC_URI[md5sum] = "0095d38f2b95343e618ec61982eba6c1"
SRC_URI[sha256sum] = "f2deda99ed2c94dd4f046007e53b10df7852a3022341dad7b57b37fbef2389b2"

S = "${WORKDIR}/er-macros-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
