SECTION = "devel/chicken"
DESCRIPTION = "A portable 32-bit assembler for x86 processors"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://sassy.meta;md5=07acd7086ce461ee5b19e0ef6ae7f614"
DEPENDS_append_class-cross = " chicken-egg-numbers-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-numbers-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-numbers chicken-egg-numbers-crosssdk"
DEPENDS = " chicken-egg-numbers chicken-egg-numbers-cross"
RDEPENDS_${PN} = " chicken-egg-numbers"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sassy/sassy-${PV}.tar.gz"

SRC_URI[md5sum] = "3726d0abaa3c4b4b9b8b9e03c7bd8117"
SRC_URI[sha256sum] = "230346f606a00158612c5405fd336403b4648ef7dcda9c7a0ec0fe286e36d9bd"

S = "${WORKDIR}/sassy-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
