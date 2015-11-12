SECTION = "devel/chicken"
DESCRIPTION = "Alex Shinn's LOOP macro"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://loopy-loop.meta;md5=d8989c66a7020b5c385bbcee4b077200"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/loopy-loop/loopy-loop-${PV}.tar.gz"

SRC_URI[md5sum] = "498fff8a4932861a4d698b983a891ed8"
SRC_URI[sha256sum] = "405f563689e5decc7f5bc6d92d859ceb929359196e9e9504a547e700ec434c84"

S = "${WORKDIR}/loopy-loop-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
