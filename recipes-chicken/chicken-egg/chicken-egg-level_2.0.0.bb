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

SRC_URI[md5sum] = "a531db489b1469e5b4b8eeeb4dba04ed"
SRC_URI[sha256sum] = "f03fd0b948b7ccbcd83516034ed329273e87d67f65cd59934c915dd1ba248b94"

S = "${WORKDIR}/level-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
