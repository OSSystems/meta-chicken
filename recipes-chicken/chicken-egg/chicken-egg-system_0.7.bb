SECTION = "devel/chicken"
DESCRIPTION = "load and compile groups of files"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://system.meta;md5=9c308b3885d72785c9e03ab26294b188"
DEPENDS_append_class-cross = " chicken-egg-coops-cross chicken-egg-shell-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-coops-crosssdk chicken-egg-shell-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-coops nativesdk-chicken-egg-shell chicken-egg-coops-crosssdk chicken-egg-shell-crosssdk"
DEPENDS = " chicken-egg-coops chicken-egg-shell chicken-egg-coops-cross chicken-egg-shell-cross"
RDEPENDS_${PN} = " chicken-egg-coops chicken-egg-shell"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/system/system-${PV}.tar.gz"

SRC_URI[md5sum] = "5808a54937b8e06268fc31991109ef71"
SRC_URI[sha256sum] = "83bbb1b952c8838c9ab3c91c89d926b1560deca2adb36eaeb9731b9dbae50764"

S = "${WORKDIR}/system-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
