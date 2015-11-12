SECTION = "devel/chicken"
DESCRIPTION = "Immutable typed lists and sets"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://typed-lists.meta;md5=b4861fa406f14eef4d8e72bb1bedd2c1"
DEPENDS_append_class-cross = " chicken-egg-datatype-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-datatype-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-datatype chicken-egg-datatype-crosssdk"
DEPENDS = " chicken-egg-datatype chicken-egg-datatype-cross"
RDEPENDS_${PN} = " chicken-egg-datatype"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/typed-lists/typed-lists-${PV}.tar.gz"

SRC_URI[md5sum] = "c089dfe152bc70f5d653104ee7b84490"
SRC_URI[sha256sum] = "4f15f6f25d40e14d286c46b2a43a240be1707363c217297ded20ed695af6df1e"

S = "${WORKDIR}/typed-lists-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
