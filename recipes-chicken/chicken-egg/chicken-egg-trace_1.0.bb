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

SRC_URI[md5sum] = "9e58510319cd389ae19aa329c5798bdb"
SRC_URI[sha256sum] = "8a2bd2d05c7ec972fb5b12806317bfb3e6aba705c4091614655d3ad3e9dc9e4d"

S = "${WORKDIR}/trace-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
