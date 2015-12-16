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

SRC_URI[md5sum] = "b81a032aa35cbaea319ff77e4ed0fa2b"
SRC_URI[sha256sum] = "1a8c15b79e82f5d19cbe5eebd7544658b245659323191f561a0480d2d154f2dc"

S = "${WORKDIR}/typed-lists-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
