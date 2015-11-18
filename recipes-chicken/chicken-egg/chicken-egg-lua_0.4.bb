SECTION = "devel/chicken"
DESCRIPTION = "Embed Lua interpreter into Scheme applications"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://lua.meta;md5=89926f643361f2ac8e02c9b7eac0808c"
DEPENDS_append_class-cross = " chicken-egg-dollar-cross chicken-egg-make-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-dollar-crosssdk chicken-egg-make-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-dollar nativesdk-chicken-egg-make chicken-egg-dollar-crosssdk chicken-egg-make-crosssdk"
DEPENDS = " chicken-egg-dollar chicken-egg-make chicken-egg-dollar-cross chicken-egg-make-cross"
RDEPENDS_${PN} = " chicken-egg-dollar chicken-egg-make"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/lua/lua-${PV}.tar.gz"

SRC_URI[md5sum] = "9a97786c98ec098d79f5b97b34db961a"
SRC_URI[sha256sum] = "b1da60362e178b0ccdec9e3c6b81997e29c3d39cd662110fe66f41d2395cdd52"

S = "${WORKDIR}/lua-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
