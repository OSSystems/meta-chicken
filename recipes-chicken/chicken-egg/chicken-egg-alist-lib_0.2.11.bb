SECTION = "devel/chicken"
DESCRIPTION = "SRFI-69-like library for alists"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://alist-lib.meta;md5=a21a46a0e34cd04e56e03b0f201761f2"
DEPENDS_append_class-cross = " chicken-egg-hahn-cross chicken-egg-matchable-cross chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-hahn-crosssdk chicken-egg-matchable-crosssdk chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-hahn nativesdk-chicken-egg-matchable nativesdk-chicken-egg-setup-helper chicken-egg-hahn-crosssdk chicken-egg-matchable-crosssdk chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-hahn chicken-egg-matchable chicken-egg-setup-helper chicken-egg-hahn-cross chicken-egg-matchable-cross chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-hahn chicken-egg-matchable chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/alist-lib/alist-lib-${PV}.tar.gz"

SRC_URI[md5sum] = "457553925b5bed87c6c5c9d5ff6cd3c0"
SRC_URI[sha256sum] = "125a305512d04af9f4a8f5edccfa742bd9c8f1497133972aba0f45729287ce44"

S = "${WORKDIR}/alist-lib-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
