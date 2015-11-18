SECTION = "devel/chicken"
DESCRIPTION = "Set up and take down environment vars"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://call-with-environment-variables.meta;md5=bd795106ae3d77b9fbdb5b44b17681ee"
DEPENDS_append_class-cross = " chicken-egg-hahn-cross chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-hahn-crosssdk chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-hahn nativesdk-chicken-egg-setup-helper chicken-egg-hahn-crosssdk chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-hahn chicken-egg-setup-helper chicken-egg-hahn-cross chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-hahn chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/call-with-environment-variables/call-with-environment-variables-${PV}.tar.gz"

SRC_URI[md5sum] = "afe2311a4e3cd6181573c919ba998f6f"
SRC_URI[sha256sum] = "2ca42665e02a209d8d80d2237555c2b112a2e12e7b3281ae714bc123c83de120"

S = "${WORKDIR}/call-with-environment-variables-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
