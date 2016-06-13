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

SRC_URI[md5sum] = "fe835fa0dde15364d0519a5d12976ffb"
SRC_URI[sha256sum] = "609432d148033198c3ef68c771254441e7f2cb0cf6706d532f660169630e2b30"

S = "${WORKDIR}/F-operator-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
