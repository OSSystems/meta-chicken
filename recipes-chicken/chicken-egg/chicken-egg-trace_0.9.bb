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

SRC_URI[md5sum] = "038929b870f18e06e085d274bc710007"
SRC_URI[sha256sum] = "2e1f00af04a12a8e65160be2caf154315787c015f4fa3a2cf2358b3471f9e3f5"

S = "${WORKDIR}/trace-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
