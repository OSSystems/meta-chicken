SECTION = "devel/chicken"
DESCRIPTION = "Pattern matching with destructuring bindings"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://bindings.meta;md5=b4a6874b7dd399a5a13900c95138c6a1"
DEPENDS_append_class-cross = " chicken-egg-procedural-macros-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-procedural-macros-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-procedural-macros chicken-egg-procedural-macros-crosssdk"
DEPENDS = " chicken-egg-procedural-macros chicken-egg-procedural-macros-cross chicken-egg-bindings-cross"
RDEPENDS_${PN} = " chicken-egg-procedural-macros"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/bindings/bindings-${PV}.tar.gz"

SRC_URI[md5sum] = "8b184344c3c4d17f98d637e447c1096c"
SRC_URI[sha256sum] = "7d24525277be8e6f7edfaf39be914d1bf83e26a0b14ec9fa1b6335f66fe9f576"

S = "${WORKDIR}/bindings-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
