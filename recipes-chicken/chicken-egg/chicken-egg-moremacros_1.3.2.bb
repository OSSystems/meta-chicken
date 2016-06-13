SECTION = "devel/chicken"
DESCRIPTION = "More misc macros"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://moremacros.meta;md5=6d170ad50ffb88add46aca95f9fde0c9"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-miscmacros chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-moremacros-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-miscmacros"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/moremacros/moremacros-${PV}.tar.gz"

SRC_URI[md5sum] = "63f94ba7444ad3cef79c32e71cc2fcff"
SRC_URI[sha256sum] = "dc0354d67e7f4f81557c1fcd52ca12924c2af2c28fa8d6bf788dc3783ea0c915"

S = "${WORKDIR}/moremacros-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
