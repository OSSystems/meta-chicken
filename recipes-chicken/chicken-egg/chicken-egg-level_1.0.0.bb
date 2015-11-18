SECTION = "devel/chicken"
DESCRIPTION = "Provides a high-level API to leveldb implementations"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://level.meta;md5=38d326d3f4db1d971f4096d523f46c21"
DEPENDS_append_class-cross = " chicken-egg-interfaces-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-interfaces-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-interfaces chicken-egg-interfaces-crosssdk"
DEPENDS = " chicken-egg-interfaces chicken-egg-interfaces-cross"
RDEPENDS_${PN} = " chicken-egg-interfaces"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/level/level-${PV}.tar.gz"

SRC_URI[md5sum] = "b67d0d5d894f5582b7e5e4eb412b4cfb"
SRC_URI[sha256sum] = "8e86e1d0904bb2cc2bd639be6431fba7c208147f87ae0442338db5e753da6b31"

S = "${WORKDIR}/level-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
