SECTION = "devel/chicken"
DESCRIPTION = "Bindings to SDL_ttf 2"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sdl2-ttf.meta;md5=3b40033b251832c024b6d03e37ae64bc"
DEPENDS_append_class-cross = " chicken-egg-sdl2-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-sdl2-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-sdl2 chicken-egg-sdl2-crosssdk"
DEPENDS = " chicken-egg-sdl2 chicken-egg-sdl2-cross"
RDEPENDS_${PN} = " chicken-egg-sdl2"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sdl2-ttf/sdl2-ttf-${PV}.tar.gz"

SRC_URI[md5sum] = "756cd42414436478657c370b9c902f25"
SRC_URI[sha256sum] = "2707125a385fd648a59a795c9ef432621aee5a754c6053843456f412def14ef1"

S = "${WORKDIR}/sdl2-ttf-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
