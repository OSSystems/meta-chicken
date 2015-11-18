SECTION = "devel/chicken"
DESCRIPTION = "An egg documentation tool"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://eggdoc.meta;md5=ca71a736bd1ef4bf2c8e75a4daec0ffd"
DEPENDS_append_class-cross = " chicken-egg-sxml-transforms-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-sxml-transforms-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-sxml-transforms chicken-egg-sxml-transforms-crosssdk"
DEPENDS = " chicken-egg-sxml-transforms chicken-egg-sxml-transforms-cross"
RDEPENDS_${PN} = " chicken-egg-sxml-transforms"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/eggdoc/eggdoc-${PV}.tar.gz"

SRC_URI[md5sum] = "6d5d11ffca5124264053cb05dcaab1d8"
SRC_URI[sha256sum] = "2db103c78969376581b8f6128273586bbc816bd2d1b0d091384794f5c2d5849e"

S = "${WORKDIR}/eggdoc-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
