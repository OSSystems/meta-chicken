SECTION = "devel/chicken"
DESCRIPTION = "Modules with optional type signatures"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://typed-modules.meta;md5=7261ca5df66171bdb51e4d47b76782bf"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/typed-modules/typed-modules-${PV}.tar.gz"

SRC_URI[md5sum] = "5d8d5dd9c90fb255bc00c2b196bbf5a6"
SRC_URI[sha256sum] = "b37507b2226e6cff7649f4d0b950ed783bc5ee977334e66dc43186113a0eb011"

S = "${WORKDIR}/typed-modules-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
