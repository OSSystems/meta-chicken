SECTION = "devel/chicken"
DESCRIPTION = "Bindings to SDL_image 2"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sdl2-image.meta;md5=239a9676d82c8c3f539782b65da352c7"
DEPENDS_append_class-cross = " chicken-egg-sdl2-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-sdl2-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-sdl2 chicken-egg-sdl2-crosssdk"
DEPENDS = " chicken-egg-sdl2 chicken-egg-sdl2-cross"
RDEPENDS_${PN} = " chicken-egg-sdl2"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sdl2-image/sdl2-image-${PV}.tar.gz"

SRC_URI[md5sum] = "768284085b37bc8fc6cf2f5a29d9f300"
SRC_URI[sha256sum] = "5dfe6f0a0932f9cbc4406dddfccb12e75ef889b8d71e68d3cfe264de0b917636"

S = "${WORKDIR}/sdl2-image-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
