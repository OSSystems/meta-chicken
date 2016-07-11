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

SRC_URI[md5sum] = "253169e5807b0537b0d452b670753cb2"
SRC_URI[sha256sum] = "24807ac005fbaf88f3424a8287094cc57aa93581ab1e647254695183ef29cc2d"

S = "${WORKDIR}/level-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
