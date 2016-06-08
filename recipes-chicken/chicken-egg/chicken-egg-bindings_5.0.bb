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

SRC_URI[md5sum] = "3ab21c6befb4395901cdf439086724e0"
SRC_URI[sha256sum] = "98ab94fc7583fd3695b3263dbd0350d76ef0191207e79c330023c32661e6a22a"

S = "${WORKDIR}/bindings-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
