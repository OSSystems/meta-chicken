SECTION = "devel/chicken"
DESCRIPTION = "Implements C3 class linearization for TinyCLOS"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://c3.meta;md5=761aa9153d81da8eeb7f7bf2c94f0e9a"
DEPENDS_append_class-cross = " chicken-egg-tinyclos-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-tinyclos-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-tinyclos chicken-egg-tinyclos-crosssdk"
DEPENDS = " chicken-egg-tinyclos chicken-egg-tinyclos-cross"
RDEPENDS_${PN} = " chicken-egg-tinyclos"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/c3/c3-${PV}.tar.gz"

SRC_URI[md5sum] = "d2fb103a4d11de9cb30e9079b2cbccc6"
SRC_URI[sha256sum] = "1507023fadf5131b4cd5ed08886cfd9465b703c59595587617f73d1c39dea1dc"

S = "${WORKDIR}/c3-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
