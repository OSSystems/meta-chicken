SECTION = "devel/chicken"
DESCRIPTION = "Bindings for OpenBSD's pledge(2)"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://pledge.meta;md5=97961af348ef4d286de1daaced4c1d31"
DEPENDS_append_class-cross = " chicken-egg-module-declarations-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-module-declarations-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-module-declarations chicken-egg-module-declarations-crosssdk"
DEPENDS = " chicken-egg-module-declarations chicken-egg-module-declarations-cross"
RDEPENDS_${PN} = " chicken-egg-module-declarations"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/pledge/pledge-${PV}.tar.gz"

SRC_URI[md5sum] = "ce0d2a58be7c002c3474423edf905f88"
SRC_URI[sha256sum] = "092ebdaa2ac7602ecda68a55c17cb9610b09755dfddf4deedd679a1d68ddcd36"

S = "${WORKDIR}/pledge-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
