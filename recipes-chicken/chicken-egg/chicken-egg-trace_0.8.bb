SECTION = "devel/chicken"
DESCRIPTION = "tracing and breakpoints"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://trace.meta;md5=c6d7c6c674df138ed89b292aa3bcef89"
DEPENDS_append_class-cross = " chicken-egg-advice-cross chicken-egg-miscmacros-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-advice-crosssdk chicken-egg-miscmacros-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-advice nativesdk-chicken-egg-miscmacros chicken-egg-advice-crosssdk chicken-egg-miscmacros-crosssdk"
DEPENDS = " chicken-egg-advice chicken-egg-miscmacros chicken-egg-advice-cross chicken-egg-miscmacros-cross"
RDEPENDS_${PN} = " chicken-egg-advice chicken-egg-miscmacros"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/trace/trace-${PV}.tar.gz"

SRC_URI[md5sum] = "4dfe1062acac0b26d11a6e1f88fee6f6"
SRC_URI[sha256sum] = "e54ed4c6790b9d9d4421d18ed08e8fc4feef3ddb2112a39ad2acc8c93a34344e"

S = "${WORKDIR}/trace-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
