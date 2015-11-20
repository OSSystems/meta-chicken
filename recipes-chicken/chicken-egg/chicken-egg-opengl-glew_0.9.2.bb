SECTION = "devel/chicken"
DESCRIPTION = "Bindings to OpenGL core profile with extension loading with GLEW"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://opengl-glew.meta;md5=fbfa39d151a1d3822a61614401ec4042"
DEPENDS_append_class-cross = " chicken-egg-make-cross chicken-egg-bind-cross glew-native"
DEPENDS_append_class-crosssdk = " chicken-egg-make-crosssdk chicken-egg-bind-crosssdk glew-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-make nativesdk-chicken-egg-bind chicken-egg-make-crosssdk chicken-egg-bind-crosssdk"
DEPENDS = " chicken-egg-make chicken-egg-bind glew chicken-egg-make-cross chicken-egg-bind-cross"
RDEPENDS_${PN} = " chicken-egg-make chicken-egg-bind"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/opengl-glew/opengl-glew-${PV}.tar.gz"

SRC_URI[md5sum] = "51b93278481f23599ba5a884b5258b91"
SRC_URI[sha256sum] = "6ac7be89dec96aef0d861e5fd7b58f6cb4e63096bb2f25824c7da9c218c11dcc"

S = "${WORKDIR}/opengl-glew-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
