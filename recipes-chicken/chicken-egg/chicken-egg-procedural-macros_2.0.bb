SECTION = "devel/chicken"
DESCRIPTION = "Procedural-macros made easy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://procedural-macros.meta;md5=0086f8fe6a4eb3b34f2a4573fb61cb7a"
DEPENDS_append_class-cross = " chicken-egg-bindings-cross chicken-egg-basic-sequences-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-bindings-crosssdk chicken-egg-basic-sequences-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-bindings nativesdk-chicken-egg-basic-sequences chicken-egg-bindings-crosssdk chicken-egg-basic-sequences-crosssdk"
DEPENDS = " chicken-egg-bindings chicken-egg-basic-sequences chicken-egg-bindings-cross chicken-egg-basic-sequences-cross"
RDEPENDS_${PN} = " chicken-egg-bindings chicken-egg-basic-sequences"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/procedural-macros/procedural-macros-${PV}.tar.gz"

SRC_URI[md5sum] = "039151fe42e9fb7eb34f4e6cf8a2e459"
SRC_URI[sha256sum] = "88ac1660003f870cac410b1305ef9b4a24d49b94d6fbfd8f03ac2bf0e223fabf"

S = "${WORKDIR}/procedural-macros-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
