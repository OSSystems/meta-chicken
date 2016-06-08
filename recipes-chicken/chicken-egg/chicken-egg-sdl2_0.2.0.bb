SECTION = "devel/chicken"
DESCRIPTION = "Bindings to Simple DirectMedia Layer (SDL) 2"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sdl2.meta;md5=3dc96ee509457d09a941c3086bc30625"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sdl2/sdl2-${PV}.tar.gz"

SRC_URI[md5sum] = "1bddb2f0da98d0692f4f08f62327f7eb"
SRC_URI[sha256sum] = "1a646a3b20c6448cefc2add3fbe724a96b439c1bf31ae7c2da751cb7f3313dbc"

S = "${WORKDIR}/sdl2-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
