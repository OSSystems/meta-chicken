SECTION = "devel/chicken"
DESCRIPTION = "OpenAL 1.1 bindings"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://openal.meta;md5=f13e4c93f96dfae2f30743989b801d0c"
DEPENDS_append_class-cross = " chicken-egg-easyffi-cross chicken-egg-make-cross openal-soft-native"
DEPENDS_append_class-crosssdk = " chicken-egg-easyffi-crosssdk chicken-egg-make-crosssdk openal-soft-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-easyffi nativesdk-chicken-egg-make chicken-egg-easyffi-crosssdk chicken-egg-make-crosssdk"
DEPENDS = " chicken-egg-easyffi chicken-egg-make openal-soft chicken-egg-easyffi-cross chicken-egg-make-cross"
RDEPENDS_${PN} = " chicken-egg-easyffi chicken-egg-make"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/openal/openal-${PV}.tar.gz"

SRC_URI[md5sum] = "6c426a75c833fad54c3e96e8266e2290"
SRC_URI[sha256sum] = "982f2aa5c12d307c0cb0838222a9810c048df4bfc3c812ddf2c1b195b96f4324"

S = "${WORKDIR}/openal-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
