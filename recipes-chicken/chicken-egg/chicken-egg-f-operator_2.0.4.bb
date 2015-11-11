SECTION = "devel/chicken"
DESCRIPTION = "Shift/Reset Control Operators."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://F-operator.meta;md5=3bcdda9060148e3fe2f36162546b8023"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-datatype-cross chicken-egg-box-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-datatype-crosssdk chicken-egg-box-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-datatype nativesdk-chicken-egg-box chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-datatype-crosssdk chicken-egg-box-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-datatype chicken-egg-box chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-datatype-cross chicken-egg-box-cross chicken-egg-f-operator-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-datatype chicken-egg-box"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/F-operator/F-operator-${PV}.tar.gz"

SRC_URI[md5sum] = "67bc40b6d1c765496511cf1494bfbd6a"
SRC_URI[sha256sum] = "6ae765e1db239901de87d98cb677ff568fb7e431484d85f94f6901bf08dd781a"

S = "${WORKDIR}/F-operator-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
