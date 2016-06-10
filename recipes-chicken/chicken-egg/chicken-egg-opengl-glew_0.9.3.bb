SECTION = "devel/chicken"
DESCRIPTION = "Bindings to OpenGL core profile with extension loading with GLEW"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://opengl-glew.meta;md5=9395357584979aa6cf73c6e80a8868b5"
DEPENDS_append_class-cross = " chicken-egg-bind-cross glew-native"
DEPENDS_append_class-crosssdk = " chicken-egg-bind-crosssdk glew-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-bind nativesdk-glew chicken-egg-bind-crosssdk"
DEPENDS = " chicken-egg-bind glew chicken-egg-bind-cross"
RDEPENDS_${PN} = " chicken-egg-bind"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/opengl-glew/opengl-glew-${PV}.tar.gz"

SRC_URI[md5sum] = "97730802a658ed4ed1986cc20f2ff967"
SRC_URI[sha256sum] = "b87208501c76039a9de27e3210fd993ace9e443a5de980c0c2ea7e8f9d828bb2"

S = "${WORKDIR}/opengl-glew-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
